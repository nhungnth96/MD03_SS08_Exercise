package BT2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Point2D point2D = new Point2D(1,2);
       Point3D point3D = new Point3D(point2D.getX(), point2D.getY(),3 );
        System.out.println(point2D);
        System.out.println(point3D);
    }
}