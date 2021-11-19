/////////////////////////////////////////////// 		 				  		 				   
//// ECRIVEZ VOTRE CODE ENTRE DEBUT ET FIN //// 		 				  		 				   
/////////////////////////////////////////////// 		 				  		 				   
 		 				  		 				   
public static void afficheComplexe( final char pAff, final double pRe, final double pIm, final double pMod, final double pArg ) 		 				  		 				   
{ // VOTRE CODE DE L'EXERCICE PRECEDENT : 		 				  		 				   
    // Les variables pAff, pRe, pIm, pMod et pArg sont déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
switch (pAff) { 		 				  		 				   
    case 'a' : 		 				  		 				   
        if(estNul(pRe)){ 		 				  		 				   
            if(estNul(pIm)){ 		 				  		 				   
            afficheReel(0.00); 		 				  		 				   
            break; 		 				  		 				   
            } 		 				  		 				   
            else{ 		 				  		 				   
            afficheReel(pIm); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
            break; 		 				  		 				   
            } 		 				  		 				   
        } 		 				  		 				   
        if(estNul(pIm)){ 		 				  		 				   
            afficheReel(pRe); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pIm==1){ 		 				  		 				   
            afficheReel(pRe); 		 				  		 				   
            afficheChaine("+i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pIm==-1){ 		 				  		 				   
            afficheReel(pRe); 		 				  		 				   
            afficheChaine("-i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pIm<0){ 		 				  		 				   
            afficheReel(pRe); 		 				  		 				   
            afficheReel(pIm); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        else{ 		 				  		 				   
            afficheReel(pRe); 		 				  		 				   
            afficheChaine("+"); 		 				  		 				   
            afficheReel(pIm); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case 'e' : 		 				  		 				   
        if(estNul(pMod)){ 		 				  		 				   
            afficheReel(0.00); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(estNul(pArg)){ 		 				  		 				   
            afficheReel(pMod); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pArg==1.00){ 		 				  		 				   
            afficheReel(pMod); 		 				  		 				   
            afficheChaine("e^i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pArg==-1.00){ 		 				  		 				   
            afficheReel(pMod); 		 				  		 				   
            afficheChaine("e^-i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pMod==1.00){ 		 				  		 				   
            afficheChaine("e^"); 		 				  		 				   
            afficheReel(pArg); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        if(pMod==-1.00){ 		 				  		 				   
            afficheChaine("-e^"); 		 				  		 				   
            afficheReel(pArg); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        else{ 		 				  		 				   
            afficheReel(pMod); 		 				  		 				   
            afficheChaine("e^"); 		 				  		 				   
            afficheReel(pArg); 		 				  		 				   
            afficheChaine("i"); 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    default : 		 				  		 				   
        afficheChaine("<forme inconnue>"); 		 				  		 				   
        break; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
public static void main(String[] argv) throws Exception 		 				  		 				   
{ 		 				  		 				   
//// DEBUT //// 		 				  		 				   
 		 				  		 				   
double z1 = lireReel(); 		 				  		 				   
double z2 = lireReel(); 		 				  		 				   
boolean z1Null = estNul(z1); 		 				  		 				   
boolean z2Null = estNul(z2); 		 				  		 				   
 		 				  		 				   
char Opération = lireChar(); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
switch (Opération) { 		 				  		 				   
    case 'c' : 		 				  		 				   
        afficheReel(z1*cos(z2)); 		 				  		 				   
        afficheReel(z1*sin(z2)); 		 				  		 				   
        afficheChaine("i"); 		 				  		 				   
        break; 		 				  		 				   
    case 'p' : 		 				  		 				   
        afficheComplexe('e', 0, 0, sqrt(z1*z1+z2*z2), 2*atan((z2)/(z1+sqrt(z1*z1+z2*z2)))); 		 				  		 				   
        break; 		 				  		 				   
    case 'b' : 		 				  		 				   
        char Type = lireChar(); 		 				  		 				   
        switch (Type){ 		 				  		 				   
            case 'a' : 		 				  		 				   
                afficheComplexe('a', z1 ,-z2, 0, 0); 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
            case 'e' : 		 				  		 				   
                afficheComplexe('e', 0, 0, sqrt(z1*z1+z2*z2), (-2)*atan((z2)/(z1+sqrt(z1*z1+z2*z2)))); 		 	// erreur ici test 4 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '1' : 		 				  		 				   
        char Type2 = lireChar(); 		 				  		 				   
        switch (Type2){ 		 				  		 				   
            case 'a' : 		 				  		 				   
                if(z1Null == true && z2Null == true){ 		 				  		 				   
                    afficheChaine("<division par zéro>"); 		 				  		 				   
                }else if(z2 > 0){ 		 				  		 				   
                    afficheComplexe('a', (z1)/((z1*z1)+(z2*z2)), -(z2)/((z1*z1)+(z2*z2)), 0, 0); 		 				  		 				   
                }else{ 		 				  		 				   
                    afficheComplexe('a', z1/((z1*z1)+(z2*z2)), z2/((z1*z1)+(z2*z2)), 0, 0); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
            case 'e' : 		 				  		 				   
               if(z1Null == true && z2Null == true){ 		 				  		 				   
                    afficheChaine("<division par zéro>"); 		 				  		 				   
                }else if(z2 > 0){ 		 				  		 				   
                    afficheComplexe('e', 0, 0, 1/(sqrt(z1*z1+z2*z2)), -2*atan(z2/(z1+sqrt(z1*z1+z2*z2)))); 		 				  		 				   
                }else{ 		 				  		 				   
                    afficheComplexe('e', 0, 0, 1/(sqrt(z1*z1+z2*z2)), 2*atan(z2/(z1+sqrt(z1*z1+z2*z2)))); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '.' : 		 				  		 				   
        char Type3 = lireChar(); 		 				  		 				   
        switch (Type3){ 		 				  		 				   
            case 'a' : 		 				  		 				   
                double random1 = lireReel(); 		 				  		 				   
                boolean random1Null = estNul(random1); 		 				  		 				   
                if(random1Null){ 		 				  		 				   
                    afficheComplexe('a', 0, 0, 0, 0); 		 				  		 				   
                }else{ 		 				  		 				   
                    afficheComplexe('a', z1*random1, z2*random1, 0, 0); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
            case 'e' : 		 				  		 				   
                double random2 = lireReel(); 		 				  		 				   
                boolean random2Null = estNul(random2); 		 				  		 				   
                if(random2Null){ 		 				  		 				   
                    afficheComplexe('e', 0, 0, 0, 0); 		 				  		 				   
                }else{ 		 				  		 				   
                    afficheComplexe('e', 0, 0, sqrt((z1*z1*random2*random2)+(z2*z2*random2*random2)), 2*atan((z2*random2)/((z1*random2)+sqrt((z1*z1*random2*random2)+(z2*z2*random2*random2))))); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '+' : 		 				  		 				   
        char Type4 = lireChar(); 		 				  		 				   
        double z1_1 = lireReel(); 		 				  		 				   
        double z2_1 = lireReel(); 		 				  		 				   
        switch(Type4){ 		 				  		 				   
            case 'a' : 		 				  		 				   
                afficheComplexe('a', (z1+z1_1), (z2+z2_1), 0, 0); 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
            case 'e' : 		 				  		 				   
               	afficheComplexe('e', 0, 0, sqrt(((z1+z1_1)*(z1+z1_1))+((z2+z2_1)*(z2+z2_1))), 2*atan((z2+z2_1)/((z1+z1_1)+sqrt(((z1+z1_1)*(z1+z1_1))+((z2+z2_1)*(z2+z2_1)))))); 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '-' : 		 				  		 				   
        char CalcSubType_5 = lireChar(); 		 				  		 				   
        double z1_2 = lireReel(); 		 				  		 				   
        double z2_2 = lireReel(); 		 				  		 				   
        switch(CalcSubType_5){ 		 				  		 				   
            case 'a': 		 				  		 				   
                afficheComplexe('a', (z1-z1_2), (z2-z2_2), 0, 0); 		 				  		 				   
                break; 		 				  		 				   
 		 	case 'e' : 		 				  		 				   
                afficheComplexe('e', 0, 0, sqrt(((z1*z1)-(2*z1*z1_2)+(z1_2*z1_2))+((z2*z2)-(2*z2*z2_2)+(z2_2*z2_2))), 2*atan((z2-z2_2)/((z1-z1_2)+sqrt(((z1*z1)-(2*z1*z1_2)+(z1_2*z1_2))+((z2*z2)-(2*z2*z2_2)+(z2_2*z2_2)))))); 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '*' : 		 				  		 				   
        char Type6 = lireChar(); 		 				  		 				   
        double z1_3 = lireReel(); 		 				  		 				   
        double z2_3 = lireReel(); 		 				  		 				   
        switch(Type6){ 		 				  		 				   
            case 'a' : 		 				  		 				   
                afficheComplexe('a', (z1*z1_3)-(z2*z2_3),(z1*z2_3)+(z2*z1_3), 0, 0); 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
            case 'e' : 		 				  		 				   
                double x_1 = (z1*z1_3)-(z2*z2_3); 		 				  		 				   
                double y_1 = (z1*z2_3)+(z2*z1_3); 		 				  		 				   
                afficheComplexe('e', 0, 0, sqrt(x_1*x_1+y_1*y_1), 2*atan((y_1)/(x_1+sqrt(x_1*x_1+y_1*y_1)))); 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
    case '/' : 		 				  		 				   
        char Type7 = lireChar(); 		 				  		 				   
        double z1_4 = lireReel(); 		 				  		 				   
        double z2_4 = lireReel(); 		 				  		 				   
        boolean z1_4_Null = estNul(z1_4); 		 				  		 				   
        boolean z2_4_Null = estNul(z2_4); 		 				  		 				   
        switch(Type7){ 		 				  		 				   
            case 'a': 		 				  		 				   
                double x_2 = (z1*z1_4)+(z2*z2_4); 		 				  		 				   
                double y_2 = (z2*z1_4)-(z1*z2_4); 		 				  		 				   
                if(z1_4_Null == true && z2_4_Null == true){ 		 				  		 				   
                    afficheChaine("<division par zéro>"); 		 				  		 				   
                }else{ 		 				  		 				   
                    afficheComplexe('a', (x_2)/(z1_4*z1_4+z2_4*z2_4), (y_2)/(z1_4*z1_4+z2_4*z2_4), 0, 0); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
 		 	case 'e' : 		 				  		 				   
                double x_3 = ((z1*z1_4)+(z2*z2_4))/(z1_4*z1_4*z2_4*z2_4); 		 				  		 				   
                double y_3 = ((z2*z1_4)-(z1*z2_4))/(z1_4*z1_4+z2_4*z2_4); 		 				  		 				   
                if(z1_4_Null == true && z2_4_Null == true){ 		 				  		 				   
                    afficheChaine("<division par zéro>"); 		 				  		 				   
                } 		 				  		 				   
                else { 		 				  		 				   
                    afficheComplexe('e', 0, 0, sqrt(x_3*x_3+y_3*y_3), 2*atan((y_3)/(x_3+sqrt(x_3*x_3+y_3*y_3)))); 		 				  		 				   
                } 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
        break; 		 				  		 				   
    default : 		 				  		 				   
        afficheChaine("<opération inconnue>"); 		 				  		 				   
        break; 		 				  		 				   
    } 		 				  		 				   
////  FIN  //// 		 				  		 				   
} 		 				  		 				   