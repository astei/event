/*
 * This file is part of event, licensed under the MIT License.
 *
 * Copyright (c) 2017-2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.event.rx2;

import io.reactivex.Flowable;
import net.kyori.event.EventBus;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A subscription adapter for {@link EventBus} which supports creating
 * {@link Flowable}s for RxJava 2.
 *
 * @param <E> the event type
 */
public interface Rx2SubscriptionAdapter<E> {
  /**
   * Creates a flowable for {@code event}.
   *
   * @param event the event
   * @param <T> the event type
   * @return a flowable
   */
  <T extends E> @NonNull Flowable<T> flowable(final @NonNull Class<T> event);
}
