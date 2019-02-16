package com.company;

public class Computer {
    class Processor{
        private boolean isstart=false;

        public void start (){
            isstart = true;
        }
        public void shutdown(){
            isstart = false;
        }
    }

    class RAM{
        private boolean isstart=false;

        public void start (){
            isstart = true;
        }
        public void shutdown(){
            isstart = false;
        }
    }
    Processor i7 = new Processor();
    RAM transend = new RAM();
}
