import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Java_3
{
   public static void main(String[] args)
   {
      JFrame frame = new ImageViewerFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //*********Found**********
      frame.setVisible(_________);
   }
}

class ImageViewerFrame extends JFrame
{
   private JLabel label;
   private JLabel labelT;
   private JFileChooser chooser;
   private JComboBox faceCombo;
   private static final int DEFAULT_SIZE = 24;
   public static final int DEFAULT_WIDTH = 570;
   public static final int DEFAULT_HEIGHT = 400;

   public ImageViewerFrame()
   {
      setTitle("ImageViewer");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      label = new JLabel();
      Container contentPane = getContentPane();
      contentPane.add(label,BorderLayout.CENTER);
      chooser = new JFileChooser();
      chooser.setCurrentDirectory(new File("."));
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      //*********Found**********
      JMenu menu = new JMenu("__________");
      menuBar.add(menu);
      JMenuItem openItem = new JMenuItem("Open");
      //*********Found**********
      _______________.add(openItem);
      openItem.addActionListener(new ActionListener()
         {  
            public void actionPerformed(ActionEvent evt)
            {  
               int r = chooser.showOpenDialog(null);
               if(r == JFileChooser.APPROVE_OPTION)
               {  
          //*********Found**********
                  String name = __________________.getSelectedFile().getPath();
                  label.setIcon(new ImageIcon(name));
               }
            }
         });
      labelT = new JLabel("�������Զ����");
      labelT.setFont(new Font("����", Font.PLAIN, DEFAULT_SIZE));
      contentPane.add(labelT, BorderLayout.NORTH );
      faceCombo = new JComboBox();
      faceCombo.setEditable(true);
      faceCombo.addItem("����");
      faceCombo.addItem("������κ");
      faceCombo.addItem("�����п�");
      faceCombo.addItem("��������");
      faceCombo.addActionListener(new
         ActionListener()
         {  
            public void actionPerformed(ActionEvent event)
            {
       //*********Found**********
               labelT.setFont(new Font((String)____________________.getSelectedItem(),
                  Font.PLAIN, DEFAULT_SIZE));
            }
         });
      JPanel comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      contentPane.add(comboPanel, BorderLayout.SOUTH);
   }
}
