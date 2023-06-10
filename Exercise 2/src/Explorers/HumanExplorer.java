package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
   public void visit(Mars mars) {
      System.out.println("Exploring a Planet");

   }

   public void visit(Saturn saturn) {

      System.out.println("RT sa saturn");
   }

   public void visit(Mercury mercury) {
      System.out.println("RT sa mercury");
   }

   public void visit(Earth earth) {
      System.out.println("RT sa earth");
   }

   public void visit(Jupiter jupiter) {
      System.out.println("RT sa jupiter");
   }

   public void visit(Venus venus) {
      System.out.println("RT sa venus");
   }

   public void visit(Neptune neptune) {
      System.out.println("RT sa neptune");
   }

   public void visit(Pluto pluto) {
      System.out.println("RT sa pluto");
   }

   public void visit(Uranus uranus) {
      System.out.println("RT sa uranus");
   }
}