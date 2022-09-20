package chapter3;

public class ClockClass {

        private int hour;
         private int minute;
         private int seconds;
         public  ClockClass( int hour, int minute, int seconds) {
             this.hour = hour;
             this.minute = minute;
             this.seconds = seconds;
         }

             public void setHour(int hour){
                 this.hour = hour;

             }
             public int getHour(){
                 if(hour > 23){
                     hour = 0;
                 }
             return hour;
             }
             public void setMinute(int minute){
             this.minute = minute;

             }
             public int getMinute(){
                 if(minute > 59){
                     minute = 0;
                 }
             return minute;
             }
             public void setSeconds(int seconds){
             this.seconds = seconds;

             }
             public int getSeconds(){
                 if(seconds > 59){
                     seconds = 0;
                 }
             return seconds;
             }


         }


