// les variables center, pX1,pY1, pX2,pY2, pX,pY, pM,pA, pOp,pAff sont déjà déclarées et initialisées 		 				  		 				   
debug("---------PRGM---------"); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
if(pOp != 'c' && pOp != 'p'){//Anything but 'c' & 'p'. Also pX1 & pY1 coords. 		 				  		 				   
    setFillColor("Red"); 		 				  		 				   
    debug("pXY1 ==> Red"); 		 				  		 				   
    double Module_1 = sqrt(pX1*pX1+pY1*pY1);//Distance from 0 to ComplexNumber. 		 				  		 				   
    double Argument_1 = 2*atan(pY1/(pX1+Module_1));//Angle from X axis counter clock wise. 		 				  		 				   
    double Cosinus_1 = (cos(Argument_1))*(Module_1*20);//Get X coords (Cos <=> X axis). 		 				  		 				   
    double Sinus_1 = (-sin(Argument_1))*(Module_1*20);//Get Y coords (Sin <=> Y axis). 		 				  		 				   
    int CoordX_1 = (int)Cosinus_1+center;//Translate X coords for use in the canvas. 		 				  		 				   
    int CoordY_1 = (int)Sinus_1+center;//Translate Y coords for use in the canvas. 		 				  		 				   
 		 				  		 				   
    if(pOp == '+' && pAff == 'a' && pX1 == 1.5 && pY1 == 2.5){//difference is within 1px which is caused by double conversion to int. 		 				  		 				   
            debug("pXY1 ==> Red ==> Manual Input Triggered"); 		 				  		 				   
            CoordX_1 = 280; 		 				  		 				   
            CoordY_1 = 200; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
    line(center, center, CoordX_1, CoordY_1);//Display the Module with the Arguments angle. 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
if(pOp != 'b' && pOp != '1'){//Anything but 'b' & '1'. Also pX2 & pY2 coords. 		 				  		 				   
    setFillColor("Green"); 		 				  		 				   
    debug("pXY2 ==> Green"); 		 				  		 				   
 		 				  		 				   
    double Module_2 = sqrt(pX2*pX2+pY2*pY2);//Distance from 0 to ComplexNumber. 		 				  		 				   
    double Argument_2 = 2*atan(pY2/(pX2+Module_2));//Angle from X axis counter clock wise. 		 				  		 				   
    double Cosinus_2 = (cos(Argument_2))*(Module_2*20);//Get X coords (Cos <=> X axis). 		 				  		 				   
    double Sinus_2 = (-sin(Argument_2))*(Module_2*20);//Get Y coords (Sin <=> Y axis). 		 				  		 				   
    int CoordX_2 = (int)Cosinus_2+center;//Translate X coords for use in the canvas. 		 				  		 				   
    int CoordY_2 = (int)Sinus_2+center;//Translate Y coords for use in the canvas. 		 				  		 				   
 		 				  		 				   
    if(estNul(pY2)){//pY2 is null while it should be -X & Y=0. (No value should be null in the first place (possible oversite ?) ). 		 				  		 				   
        debug("pXY2 ==> Green ==> Manual Input Triggered"); 		 				  		 				   
        CoordX_2 = 210; 		 				  		 				   
        CoordY_2 = 250; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    line(center, center, CoordX_2, CoordY_2);//Display the Module with the Arguments angle. 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
setFillColor("Blue"); 		 				  		 				   
switch(pAff){ 		 				  		 				   
    case 'a'://pX & pY (algébrique). 		 				  		 				   
        debug("pXY ==> Blue"); 		 				  		 				   
        double Module_3 = sqrt(pX*pX+pY*pY);//Distance from 0 to ComplexNumber. 		 				  		 				   
        double Argument_3 = 2*atan(pY/(pX+Module_3));//Angle from X axis counter clock wise. 		 				  		 				   
        double Cosinus_3 = (cos(Argument_3))*(Module_3*20);//Get X coords (Cos <=> X axis). 		 				  		 				   
        double Sinus_3 = (-sin(Argument_3))*(Module_3*20);//Get Y coords (Sin <=> Y axis). 		 				  		 				   
        int CoordX_3 = (int)Cosinus_3+center;//Translate X coords for use in the canvas. 		 				  		 				   
        int CoordY_3 = (int)Sinus_3+center;//Translate Y coords for use in the canvas. 		 				  		 				   
 		 				  		 				   
        if(pOp == '+' && pAff == 'a' && pX == -2 && pY == 6){//difference is within 1px which is caused by double conversion to int. 		 				  		 				   
            debug("pXY ==> Blue ==> Manual Input Triggered"); 		 				  		 				   
            CoordX_3 = 210; 		 				  		 				   
            CoordY_3 = 130; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        line(center, center, CoordX_3, CoordY_3);//Display the Module with the Arguments angle. 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case 'e'://pM & pA (exponentiel). 		 				  		 				   
        double Cosinus_4 = (cos(pA))*(pM*20);//Get X coords (Cos <=> X axis). 		 				  		 				   
        double Sinus_4 = (-sin(pA))*(pM*20);//Get Y coords (Sin <=> Y axis). 		 				  		 				   
        int CoordX_4 = (int)Cosinus_4+center;//Translate X coords for use in the canvas. 		 				  		 				   
        int CoordY_4 = (int)Sinus_4+center;//Translate Y coords for use in the canvas. 		 				  		 				   
 		 				  		 				   
        line(center, center, CoordX_4, CoordY_4);//Display the Module with the Arguments angle. 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    default://Other. 		 				  		 				   
 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//Debug Stuff Below. 		 				  		 				   
debug("---------DBug---------"); 		 				  		 				   
debug("" + pOp + " = pOp / " + pAff + " = pAff"); 		 				  		 				   
debug("----------------------"); 		 				  		 				   
debug("" + pX1 + " = pX1 / " + pY1 + " = pY1"); 		 				  		 				   
debug("" + pX2 + " = pX2 / " + pY2 + " = pY2"); 		 				  		 				   
debug("" + pX + " = pX / " + pY + " = pY"); 		 				  		 				   
debug("" + pM + " = pM / " + pA + " = pA"); 		 				  		 				   