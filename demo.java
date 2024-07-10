import javax.swing.*;



class demo{

JFrame f;
JInternalFrame inf;
   
demo(){

   f = new JFrame("Frame");
   f.setVisible(true);
   
   f.setSize(400,400);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   inf = new JInternalFrame("");
   inf.setVisible(true);
   inf.setLayout(null);
   f.add(inf);

   
}

   

public static void main(String[] args){

  new demo();

}
}
