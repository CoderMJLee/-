import java.awt.*;
import java.applet.*;

//*********Found********
public class Java_2 extends _______________________
{
    TextArea outputArea;

    public void init()
    {
        setLayout(new BorderLayout());
        outputArea = new TextArea();
     //*********Found********
        ____________________( outputArea );

      // ����0��10�Ľ׳�
        for ( long i = 0; i <= 10; i++ )
            //*********Found********
            outputArea.append(i + "! = " + ______________ + "\n" );
    }
   
   // �õݹ鶨��׳˷���
    public long factorial( long number )
    {                  
        if ( number <= 1 )  // �������
            return 1;
        else
            //*********Found********
            return number * factorial( ___________ - 1 );
    }  
}
