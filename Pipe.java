/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author up826133
 */
public class Pipe {
    protected double length;
    protected double diameter;
    protected int grade;
    protected String innerInsulation;
    protected String outerReinforcement;   //Outer Metallic Reinforcement
    protected String chemicalRes;   //Chemical Resistance
    protected int colourCount;
    protected final double[] costByGrade;       //Cost of 1 cubic inch of plastic by grade
    protected int[] validGrades;
    protected int quantity;

    public Pipe() {
        costByGrade = new double[5];

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }

    public Pipe(double _length, double _diameter, int _grade, int _colourCount, String _innerInsulation, String _outerReinforcement, String _chemicalRes, int _quantity) {
        costByGrade = new double[5];
        
        length = _length;
        grade = _grade;
        innerInsulation = _innerInsulation;
        outerReinforcement = _outerReinforcement;
        chemicalRes = _chemicalRes;
        colourCount = _colourCount;
        quantity = _quantity;

        costByGrade[0] = 0.4;
        costByGrade[1] = 0.6;
        costByGrade[2] = 0.75;
        costByGrade[3] = 0.8;
        costByGrade[4] = 0.95;
    }
    
    protected int getGrade(){
        return grade;
    }
    
    protected void changeGrade(int _grade){
        grade = _grade;
    }
    

    public double getCostByGrade() {
        return costByGrade[this.grade - 1];

    }

    protected void addValidGrades(int[] _grades) {
        validGrades = _grades;
    }
    
    protected int getColourCount(){
        return colourCount;
    }
    
}

class Pipe1 extends Pipe {

    public Pipe1(double _length, double _diameter, int _grade, String _chemicalRes, int _quantity) {
        super(_length,_diameter, _grade,0,"N","N", _chemicalRes, _quantity);

        validGrades = new int[3];
        super.addValidGrades(new int[]{1, 2, 3});

    }
    
}

class Pipe2 extends Pipe {

    public Pipe2(double _length, double _diameter, int _grade, String _chemicalRes, int _quantity) {
        super(_length,_diameter, _grade,1,"N","N", _chemicalRes, _quantity);

        validGrades = new int[3];
        addValidGrades(new int[]{2, 3, 4});
    }
}

class Pipe3 extends Pipe {

    public Pipe3(double _length, double _diameter, int _grade, String _chemicalRes, int _quantity) {
        super(_length,_diameter, _grade,2,"N","N", _chemicalRes, _quantity);

        validGrades = new int[4];
        addValidGrades(new int[]{2, 3, 4, 5});
    }
}

class Pipe4 extends Pipe {

    public Pipe4(double _length, double _diameter, int _grade, String _chemicalRes, int _quantity) {
        super(_length,_diameter, _grade,2,"Y","N", _chemicalRes, _quantity);

        validGrades = new int[4];
        addValidGrades(new int[]{2, 3, 4, 5});
    }
}

class Pipe5 extends Pipe {

    public Pipe5(double _length, double _diameter, int _grade, String _chemicalRes, int _quantity) {
        super(_length,_diameter, _grade,2,"Y","Y", _chemicalRes, _quantity);

        validGrades = new int[3];
        addValidGrades(new int[]{3, 4, 5});
    }
}
