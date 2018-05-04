package com.bestvike.linq.iterator;

import com.bestvike.function.Func1;
import com.bestvike.linq.IEnumerable;
import com.bestvike.linq.iteratorold.WhereEnumerableIterator;

/**
 * Created by 许崇雷 on 2017/7/10.
 */
public abstract class Iterator<TSource> extends AbstractIterator<TSource> {
    public <TResult> IEnumerable<TResult> _select(Func1<TSource, TResult> selector) {
        return new Select.SelectEnumerableIterator<TSource, TResult>(this, selector);
    }

    public IEnumerable<TSource> _where(Func1<TSource, Boolean> predicate) {
        return new WhereEnumerableIterator<>(this, predicate);
    }
}
