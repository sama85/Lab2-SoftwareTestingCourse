package main;

public class Handwatch {

        public String handwatch ( String input ){
            int len = input.length();
            int m=0 ,h = 0;
            int D = 1,M = 1;
            int Y = 2000;
            String s;
            String state = "Normal_Display";
            String instate1 = "Time";
            String instate2 = "Alarm";
            String instate3 = "min";

            for(int i=0; i< len; i++){
                switch (state){

                    case "Normal_Display" : {
                        if ( input.charAt(i) == 'c' )
                            state = "Update";
                        if ( input.charAt(i) == 'b' )
                            state = "Chime_Alarm_Set";
                        if ( input.charAt(i) == 'a' ){
                            if( instate1 == "Time")
                                instate1 = "Date";
                            else
                                instate1 = "Time";
                        }
                        break;
                    }

                    case "Chime_Alarm_Set" : {
                        if ( input.charAt(i) == 'a' ) {
                            if (instate2 == "Alarm")
                                instate2 = "Chime";
                        }
                        if ( input.charAt(i) == 'd' )
                            state = "Normal_Display";
                        break;
                    }

                    case "Update" : {
                        if (input.charAt(i) == 'a') {
                            if (instate3 == "min")
                                instate3 = "hour";
                            else if (instate3 == "hour")
                                instate3 = "day";
                            else if (instate3 == "day")
                                instate3 = "month";
                            else if (instate3 == "month")
                                instate3 = "year";
                            else if (instate3 == "year")
                                state = "Normal_Display";
                        }

                        if (input.charAt(i) == 'b'){
                            if (instate3 == "min") {
                                if (m < 60)
                                    m++;
                                else
                                    m=0;
                            }
                            else if (instate3 == "hour")
                                if ( h < 24)
                                    h++;
                                else
                                    h=0;
                            else if (instate3 == "day")
                                if ( D < 31)
                                    D++;
                                else
                                    D=1;
                            else if (instate3 == "month")
                                if ( M < 12)
                                    M++;
                                else
                                    M=1;
                            else if (instate3 == "year")
                                if ( Y < 2100)
                                    Y++;
                        }

                        if (input.charAt(i) == 'd')
                            state = "Normal_Display";
                        break;
                    }
                }
            }

            if (state == "Normal_Display") {
                s = instate1;
            }
            else if (state == "Chime_Alarm_Set"){
                s = instate1;
            }
            else {
                s = instate1;
            }

            return "Current state: " + state + ", the inner state: " + s + "  Date: " + String.valueOf(D) + " - " + String.valueOf(M) + " - " +String.valueOf(Y) + "  Time: " + String.format("%02d", h) + ":" + String.format("%02d", m);
        }
}
