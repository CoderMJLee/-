import javax.swing.JOptionPane;

public class Java_1 {
   public static void main( String args[] ){
      //������ʼ��
      int passes = 0,             //����ͨ������Ŀ
          failures = 0,           //������ͨ������Ŀ
          student = 1,            //ѧ��������
          result;                 //һ�ſ������
      String input,               //�û������ֵ
             output;              //����ַ���
      //����10��ѧ��,�ü���������ѭ��
      while ( student <= 10 ) {
         input = JOptionPane.showInputDialog(
                    "������(1=ͨ��,2=��ͨ��)" );
//*********Found**********
         result = Integer.parseInt( __________________ );
         if ( result == 1 )
            passes = passes + 1;
         else
            failures = failures + 1;
         student = student + 1;
      }
      //�������
      output = "ͨ��: " + passes +
               "\n��ͨ��: " + failures;
      if( passes > 8 )
         output = output + "\n���ѧ��";
//*********Found**********
      JOptionPane._________________________( null, output,
         "�Կ��Խ���ķ���ʾ��",
         JOptionPane.INFORMATION_MESSAGE );     
//*********Found**********
      System._______________( 0 );
   }
}
