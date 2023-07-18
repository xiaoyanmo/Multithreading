package tools;

import entity.Userinfo;

public class Tools {
    public static InheritableThreadLocal<Userinfo> tl = new InheritableThreadLocal<>();
}