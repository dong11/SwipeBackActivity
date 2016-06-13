package com.rex.swipebackactivity.app;

import com.rex.swipebackactivity.SwipeBackLayout;


public interface SwipeBackActivityBase {
     SwipeBackLayout getSwipeBackLayout();

      void setSwipeBackEnable(boolean enable);

     void scrollToFinishActivity();

}
