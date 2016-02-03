/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Carlos Alexandro Becker
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.carlosbecker;

/**
 * Calculates the degrees between some value and 0.
 * @author Carlos Alexandro Becker (caarlos0@gmail.com)
 */
public interface Degree {
    /**
     * Calculate the degree.
     * @return Degree value.
     */
    int get();

    /**
     * Hour implementation of degree.
     */
    final class Hour implements Degree {
        /**
         * Hour.
         */
        private final transient int hour;
        /**
         * Minute.
         */
        private final transient int minute;

        /**
         * Ctor.
         * @param hour Hour.
         * @param minute Minute.
         */
        Hour(final int hour, final int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        @Override
        public int get() {
            return Math.round(
                30.0f * (float) this.hour + 0.5f * (float) this.minute
            );
        }
    }

    /**
     * Minute implementation of Degree.
     */
    final class Minute implements Degree {
        /**
         * Minute.
         */
        private final transient int minute;

        /**
         * Ctor.
         * @param minute Minute.
         */
        Minute(final int minute) {
            this.minute = minute;
        }

        @Override
        public int get() {
            return 6 * this.minute;
        }
    }
}