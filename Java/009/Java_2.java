import java.io.*;
import java.util.Vector;

public class Java_2{
   public static void main(String s[]){
      Vector v=new Vector();
      try{
         //*********Found**********
         BufferedReader in = new ____________________(new InputStreamReader(System.in));  
         String str = "";
         System.out.println("�������û���������Ϣ���м��ÿո����������quit�˳�:");
         while (!(str.equals("quit")||str.equals("QUIT"))){
            str = in.readLine();
            //*********Found**********
            if(isValid(______________________))     
               v.add(str);
            else{
               if(!(str.equals("quit")||str.equals("QUIT")))
                  System.out.println("The string is NOT valid!");
            }
         }
	        
         System.out.println("�����뱣�浽���ļ���:");
         //*********Found**********
         str=_______________.readLine();

         String curDir = System.getProperty("user.dir");
         File savedfile=new File(curDir+"\\"+str);
            
         //*********Found**********
         BufferedWriter out = new BufferedWriter(new FileWriter(___________________));
         for(int i=0; i<v.size(); i++){
            String tmp=(String)v.elementAt(i);
            out.write(tmp);
            //*********Found**********
            out.write(____________________);     
         }
         out.close();
        
      }
      //*********Found**********
      ________________(Exception e){
         System.out.print("ERROR:"+e.getMessage());	
      }
   }
   /**
   * �ж�������ַ����Ƿ���Ϲ淶
   * @param  s  ����Ĵ�У����ַ���
   * @return    У��Ľ������ȷ�򷵻�Ϊ��
   */
   public static boolean isValid(String s){
      if(s.indexOf(" ")>0) return true;
      else return false;
   }
}