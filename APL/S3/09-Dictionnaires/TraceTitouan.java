import java.util.*;

public class Trace {

    public static void main(String[] args) {
        for (Map.Entry<Thread, StackTraceElement[]> map : Thread.getAllStackTraces().entrySet()) {
            System.out.println(map.getKey().getName() + " : ");
            for (StackTraceElement el : (StackTraceElement[])map.getValue()) {
            	if(el.getLineNumber()<0) {
            		System.out.println(" " + el.getClassName() + "(Native Method)");
            	}
            	else {
					System.out.println(" " + el.getClassName() + "(" + el.getFileName() + ":" + el.getLineNumber() + ")");
            	}
			}  
        }
    }
}