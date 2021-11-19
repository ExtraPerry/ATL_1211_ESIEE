// Les variables pAff, pRe, pIm, pMod et pArg sont déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
switch (pAff){ 		 				  		 				   
    //-------------------------------------------------------- 		 				  		 				   
        case 'a': 		 				  		 				   
            if(estNul(pRe) && estNul(pIm)){ //Both Re & Im = 0. 		 				  		 				   
                afficheReel(0); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pRe == 0f && pIm != 0f){ //Re = 0 but not Im. 		 				  		 				   
                afficheChaine("" + pIm + "i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pRe != 0f && pIm == 0f){ //Im = 0 but not Re. 		 				  		 				   
                afficheReel(pRe); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pRe != 0f && pIm == 1f){ //Re exists & Im = 1. 		 				  		 				   
                afficheReel(pRe); 		 				  		 				   
                afficheChaine("+i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pRe != 0f && pIm == -1f){ //Re exists & Im = -1. 		 				  		 				   
                afficheReel(pRe); 		 				  		 				   
                afficheChaine("-i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pIm > 0f){ //Im negative or positive; 		 				  		 				   
                afficheChaine("" + pRe + "+" + pIm + "i"); 		 				  		 				   
                break; 		 				  		 				   
            }else{ 		 				  		 				   
                afficheChaine("" + pRe + pIm + "i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
    //-------------------------------------------------------- 		 				  		 				   
        case 'e': 		 				  		 				   
            if(pMod == 0f && pArg == 0f){ 		 				  		 				   
                afficheReel(0); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod == 0f && pArg != 0f){ 		 				  		 				   
                afficheReel(0); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != 0f && pArg == 1f){ 		 				  		 				   
                afficheChaine("" + pMod + "e^i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != 0f && pArg == -1f){ 		 				  		 				   
                afficheChaine("" + pMod + "e^-i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != 0f && pArg == 0f){ 		 				  		 				   
                afficheReel(pMod); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != 1f && pArg == 1f){ 		 				  		 				   
                afficheChaine("e^i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != 1f && pArg == -1f){ 		 				  		 				   
                afficheChaine("e^-i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != -1f && pArg == 1f){ 		 				  		 				   
                afficheChaine("-e^i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod != -1f && pArg == -1f){ 		 				  		 				   
                afficheChaine("-e^-i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod == 1f && pArg != 1f && pArg != 0f && pArg != -1f){ 		 				  		 				   
                afficheChaine("e^"); 		 				  		 				   
                afficheReel(pArg); 		 				  		 				   
                afficheChaine("i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            if(pMod == -1f && pArg != 1f && pArg != 0f && pArg != -1f){ 		 				  		 				   
                afficheChaine("-e^"); 		 				  		 				   
                afficheReel(pArg); 		 				  		 				   
                afficheChaine("i"); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            afficheChaine("" + pMod + "e^" + pArg + "i"); 		 				  		 				   
            break; 		 				  		 				   
    //-------------------------------------------------------- 		 				  		 				   
        default: 		 				  		 				   
            afficheChaine("<forme inconnue>"); 		 				  		 				   
            break; 		 				  		 				   
    //-------------------------------------------------------- 		 				  		 				   
    } 		 				  		 				   