package com.design.pattern.observer.events.core;

public class MouseEventTest  {

    public static void main(String[] args) throws Exception{
        MouseEventCallBack callBack = new MouseEventCallBack();

        Mouse mouse = new Mouse();

        mouse.addLisenter(MouseEventType.ON_CLICK,callBack);
        mouse.addLisenter(MouseEventType.ON_MOVE,callBack);
        mouse.addLisenter(MouseEventType.ON_WHEEL,callBack);
        mouse.addLisenter(MouseEventType.ON_OVER,callBack);
        mouse.addLisenter(MouseEventType.ON_BLUR,callBack);



        mouse.click();

        mouse.blur();
    }
}
