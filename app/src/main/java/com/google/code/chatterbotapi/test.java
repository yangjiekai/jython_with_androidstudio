package com.google.code.chatterbotapi;

import org.python.util.PythonInterpreter;

/**
 * Created by ultra-jack on 2016/7/23.
 */
public class test {

    public static void main(String[] args) throws Exception {

        PythonInterpreter interp = new PythonInterpreter();
        interp.execfile("file:///android_asset/try_chatterbot_python/ChatterBot-master/examples/try.py");


//        ChatterBotFactory factory = new ChatterBotFactory();
//
//        ChatterBot bot1 = factory.create(ChatterBotType.CLEVERBOT);
//        ChatterBotSession bot1session = bot1.createSession();
//
//        ChatterBot bot2 = factory.create(ChatterBotType.PANDORABOTS, "b0dafd24ee35a477");
//        ChatterBotSession bot2session = bot2.createSession();
//
//        String s = "Hi";
//        String input;
//        Scanner scan=new Scanner(System.in);
//        while (true) {
//
//            System.out.println("bot1> " + s);
//
//            input =scan.next();
//
//           // s = bot2session.think(s);
//          //  System.out.println("bot2> " + s);
//
//            s = bot1session.think(input);
        }
    }

