/*
 * Copyright (c) 2020 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package me.everything.android.ui.overscroll.adapters;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;

public class NestedScrollViewOverScrollDecorAdapter implements IOverScrollDecoratorAdapter {

    protected final NestedScrollView mView;

    public NestedScrollViewOverScrollDecorAdapter(@NonNull NestedScrollView view) {
        this.mView = view;
    }

    public View getView() {
        return this.mView;
    }

    public boolean isInAbsoluteEnd() {
        return !this.mView.canScrollVertically(1);
    }

    public boolean isInAbsoluteStart() {
        return !this.mView.canScrollVertically(-1);
    }
}