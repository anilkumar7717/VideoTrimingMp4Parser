package com.example.videotrimingdemo.interfaces;

import com.example.videotrimingdemo.views.RangeSeekBarView;

public interface OnRangeSeekBarListener {


    void onSeek(RangeSeekBarView rangeSeekBarView, int index, float value);

    void onSeekStart(RangeSeekBarView rangeSeekBarView, int index, float value);

    void onSeekStop(RangeSeekBarView rangeSeekBarView, int index, float value);

    void onCreate(RangeSeekBarView rangeSeekBarView, int index, float value);
}
