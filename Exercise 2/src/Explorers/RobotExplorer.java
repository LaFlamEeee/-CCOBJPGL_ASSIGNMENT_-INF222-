package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {

    public void visit(Mars mars) {
        System.out.println("Tulog sa mars");

    }

    public void visit(Saturn saturn) {

        System.out.println("Tulog sa saturn");
    }

    public void visit(Mercury mercury) {
        System.out.println("Tulog sa mercury");
    }

    public void visit(Earth earth) {
        System.out.println("Tulog sa earth");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Tulog sa jupiter");
    }

    public void visit(Venus venus) {
        System.out.println("Tulog sa venus");
    }

    public void visit(Neptune neptune) {
        System.out.println("Tulog sa neptune");
    }

    public void visit(Pluto pluto) {
        System.out.println("Tulog sa pluto");
    }

    public void visit(Uranus uranus) {
        System.out.println("Tulog sa uranus");
    }
}