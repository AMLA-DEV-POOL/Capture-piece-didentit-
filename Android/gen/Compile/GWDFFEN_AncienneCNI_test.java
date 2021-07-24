/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_AncienneCNI_test
 * Date : 06/07/2021 14:43:20
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.camera.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.dessin.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_AncienneCNI_test extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_AncienneCNI_test
////////////////////////////////////////////////////////////////////////////

/**
 * CAM_ANCIENNE_CNI
 */
class GWDCAM_ANCIENNE_CNI extends WDChampCamera
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_AncienneCNI_test.CAM_ANCIENNE_CNI
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642818725241l);

super.setChecksum("614544755");

super.setNom("CAM_ANCIENNE_CNI");

super.setType(24);

super.setBulle("");

super.setLibelle("");

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleurFond(0x0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 9);

super.setTailleInitiale(633, 343);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setParamDecodageCodeBarres(0, 0, 60);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0x0, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCAM_ANCIENNE_CNI mWD_CAM_ANCIENNE_CNI;

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_AncienneCNI_test.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642818790777l);

super.setChecksum("614601171");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(302, 264);

super.setTailleInitiale(58, 55);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes Projets Mobile\\Capture pièce d'identité\\capture@dpi1x.png?E5", 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF09738, 0x701700, 0xF09738, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF09738, 0x701700, 0xF09738, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xCC7213, 0x4C0000, 0xCC7213, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant
 */
public void clicSurBoutonGauche()
// information utilisateur par defaut
{
super.clicSurBoutonGauche();

// //information utilisateur par defaut



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_bResSauvegarde = new WDBooleen();

WDObjet vWD_CNIAV = WDVarNonAllouee.ref;
WDObjet vWD_CNIAR = WDVarNonAllouee.ref;


// si gsRefUtilisate <> "" alors
if(vWD_gsRefUtilisate.opDiff(""))
{
// 	gsRefUtilisate =  gsRefUtilisate
vWD_gsRefUtilisate.setValeur(vWD_gsRefUtilisate);

// 	gsReferenceUtilisateur = gsRefUtilisate
GWDPCapture_piece_d_identite.getInstance().vWD_gsReferenceUtilisateur.setValeur(vWD_gsRefUtilisate);

}
else
{
// 	gsRefUtilisate = "00000AA"
vWD_gsRefUtilisate.setValeur("00000AA");

}

// bResSauvegarde est un booléen


// CNIAV est une Image
vWD_CNIAV = new WDInstance( new WDImage() );


// CNIAR est une image
vWD_CNIAR = new WDInstance( new WDImage() );


// SI InternetConnecté() = Vrai ALORS
if(WDAPINet.internetConnecte().opEgal(true, 0))
{
// 	gnCount = gnCount + 1
vWD_gnCount.setValeur(vWD_gnCount.opPlus(1));

// 	SI gnCount = 1 ALORS
if(vWD_gnCount.opEgal(1, 0))
{
// 		LIB_enregistrement_en_cours..VisibleAvecAnimation = Vrai
mWD_LIB_enregistrement_en_cours.setProp(EWDPropriete.PROP_VISIBLEAVECANIMATION,true);

// 		bResSauvegarde = CaméraCapture(CAM_ANCIENNE_CNI,SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"AnncienneCNI"+[fSep()]+"AnncienneCNI_AV_"+gsRefUtilisate+".jpeg",viCaptureImage,1)
vWD_bResSauvegarde.setValeur(WDAPICamera.videoCapture(mWD_CAM_ANCIENNE_CNI,WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI_AV_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg").getString(),2,new WDEntier4(1)));

// 		SI bResSauvegarde = Vrai ALORS
if(vWD_bResSauvegarde.opEgal(true, 0))
{
// 			CNIAV = SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"AnncienneCNI"+[fSep()]+"AnncienneCNI_AV_"+gsRefUtilisate+".jpeg"
vWD_CNIAV.setValeur(WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI_AV_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg"));

// 			Info(EnregistrerImage(CNIAV,"AnncienneCNI_AV_"+gsRefUtilisate,"jpeg","AnncienneCNI",gsRefUtilisate))
WDAPIDialogue.info(GWDCPCOL_ProceduresGlobales.fWD_enregistrerImage(vWD_CNIAV,new WDChaineU("AnncienneCNI_AV_").opPlus(vWD_gsRefUtilisate),new WDChaineU("jpeg"),new WDChaineU("AnncienneCNI"),vWD_gsRefUtilisate).getString());

// 			LIB_enregistrement_en_cours..VisibleAvecAnimation = faux
mWD_LIB_enregistrement_en_cours.setProp(EWDPropriete.PROP_VISIBLEAVECANIMATION,false);

// 			LIB_positionIMG1 = "ARRIERE"
mWD_LIB_positionIMG1.setValeur("ARRIERE");

// 			LIB_SansNom2..Visible = faux
mWD_LIB_SansNom2.setProp(EWDPropriete.PROP_VISIBLE,false);

// 			LIB_SansNom3..Visible = faux
mWD_LIB_SansNom3.setProp(EWDPropriete.PROP_VISIBLE,false);

}

}
else if(vWD_gnCount.opEgal(2, 0))
{
// 		LIB_enregistrement_en_cours..VisibleAvecAnimation = Vrai
mWD_LIB_enregistrement_en_cours.setProp(EWDPropriete.PROP_VISIBLEAVECANIMATION,true);

// 		bResSauvegarde = CaméraCapture(CAM_ANCIENNE_CNI,SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"AnncienneCNI"+[fSep()]+"AnncienneCNI_AR_"+gsRefUtilisate+".jpeg",viCaptureImage,1)
vWD_bResSauvegarde.setValeur(WDAPICamera.videoCapture(mWD_CAM_ANCIENNE_CNI,WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI_AR_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg").getString(),2,new WDEntier4(1)));

// 		SI bResSauvegarde = Vrai ALORS
if(vWD_bResSauvegarde.opEgal(true, 0))
{
// 			CNIAR = SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"AnncienneCNI"+[fSep()]+"AnncienneCNI_AR_"+gsRefUtilisate+".jpeg"
vWD_CNIAR.setValeur(WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("AnncienneCNI_AR_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg"));

// 			Info(EnregistrerImage(CNIAR,"AnncienneCNI_AR_"+gsRefUtilisate,"jpeg","AnncienneCNI",gsRefUtilisate))
WDAPIDialogue.info(GWDCPCOL_ProceduresGlobales.fWD_enregistrerImage(vWD_CNIAR,new WDChaineU("AnncienneCNI_AR_").opPlus(vWD_gsRefUtilisate),new WDChaineU("jpeg"),new WDChaineU("AnncienneCNI"),vWD_gsRefUtilisate).getString());

// 			LIB_enregistrement_en_cours..VisibleAvecAnimation = faux
mWD_LIB_enregistrement_en_cours.setProp(EWDPropriete.PROP_VISIBLEAVECANIMATION,false);

// 			SI OuiNon("Voulez-vous faire une autre capture ?") = Oui ALORS
if(WDAPIDialogue.ouiNon("Voulez-vous faire une autre capture ?").opEgal(1, 0))
{
// 				gnCount					= 0
vWD_gnCount.setValeur(0);

// 				LIB_positionIMG1			= "AVANT"
mWD_LIB_positionIMG1.setValeur("AVANT");

// 				LIB_SansNom2..Visible	= vrai
mWD_LIB_SansNom2.setProp(EWDPropriete.PROP_VISIBLE,true);

// 				LIB_SansNom3..Visible	= Vrai
mWD_LIB_SansNom3.setProp(EWDPropriete.PROP_VISIBLE,true);

// 				OuvreFenêtreMobile(FEN_choixDocument)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_choixDocument);

}
else
{
// 				OuvreFenêtreMobile(FEN_choixDocument)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_choixDocument);

}

}

}

}
else
{
// 	Info("Aucune connexion Internet n'est active")
WDAPIDialogue.info("Aucune connexion Internet n'est active");

// 	RETOUR
return;

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant mWD_BTN_Flottant;

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_AncienneCNI_test.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642818856313l);

super.setChecksum("614666251");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(89, 33);

super.setTailleInitiale(472, 294);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x80, 0xFF, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1;

/**
 * LIB_SansNom2
 */
class GWDLIB_SansNom2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_AncienneCNI_test.LIB_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642818921849l);

super.setChecksum("614731787");

super.setNom("LIB_SansNom2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(116, 93);

super.setTailleInitiale(115, 161);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x262626, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFF0F00, 0x7F0000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom2 mWD_LIB_SansNom2;

/**
 * LIB_SansNom3
 */
class GWDLIB_SansNom3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_AncienneCNI_test.LIB_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642818987385l);

super.setChecksum("614797323");

super.setNom("LIB_SansNom3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(427, 231);

super.setTailleInitiale(134, 96);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xFF0F00, 0x7F0000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom3 mWD_LIB_SansNom3;

/**
 * BTN_R1
 */
class GWDBTN_R1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_AncienneCNI_test.BTN_R1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642819052921l);

super.setChecksum("614863315");

super.setNom("BTN_R1");

super.setType(4);

super.setBulle("");

super.setLibelle("X");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(519, 33);

super.setTailleInitiale(32, 25);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(4);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xDCDCDC, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xDCDCDC, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xDCDCDC, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_R1 mWD_BTN_R1;

/**
 * LIB_positionIMG1
 */
class GWDLIB_positionIMG1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_AncienneCNI_test.LIB_positionIMG1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642819118457l);

super.setChecksum("614928395");

super.setNom("LIB_positionIMG1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("AVANT");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(442, 35);

super.setTailleInitiale(78, 21);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 3, 0, 0x262626, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_positionIMG1 mWD_LIB_positionIMG1;

/**
 * LIB_enregistrement_en_cours
 */
class GWDLIB_enregistrement_en_cours extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_AncienneCNI_test.LIB_enregistrement_en_cours
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2370042642819183993l);

super.setChecksum("614993931");

super.setNom("LIB_enregistrement_en_cours");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Enregistrement en cours...");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(233, 176);

super.setTailleInitiale(239, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(8);

super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_enregistrement_en_cours mWD_LIB_enregistrement_en_cours;

/**
 * Traitement: Déclarations globales de FEN_AncienneCNI_test
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre(gsRefUtilisate)
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gsRefUtilisate = WD_tabParam[0];
}
else { vWD_gsRefUtilisate = null; }
super.ajouterVariableGlobale("gsRefUtilisate",vWD_gsRefUtilisate);



// gsRefUtilisate = gsRefUtilisate
vWD_gsRefUtilisate.setValeur(vWD_gsRefUtilisate);

// gnCount est un entier
vWD_gnCount = new WDEntier4();

super.ajouterVariableGlobale("gnCount",vWD_gnCount);



// InitHasard()
WDAPIDiversSTD.initHasard();

// gnOmIncrementationCni est un entier
vWD_gnOmIncrementationCni = new WDEntier4();

super.ajouterVariableGlobale("gnOmIncrementationCni",vWD_gnOmIncrementationCni);



// gnOmIncrementationCni = Hasard(99999)
vWD_gnOmIncrementationCni.setValeur(WDAPIDiversSTD.hasard(99999));

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gsRefUtilisate = WDVarNonAllouee.ref;
 public WDObjet vWD_gnCount = WDVarNonAllouee.ref;
 public WDObjet vWD_gnOmIncrementationCni = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_AncienneCNI_test
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_CAM_ANCIENNE_CNI = new GWDCAM_ANCIENNE_CNI();
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_LIB_SansNom2 = new GWDLIB_SansNom2();
mWD_LIB_SansNom3 = new GWDLIB_SansNom3();
mWD_BTN_R1 = new GWDBTN_R1();
mWD_LIB_positionIMG1 = new GWDLIB_positionIMG1();
mWD_LIB_enregistrement_en_cours = new GWDLIB_enregistrement_en_cours();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_AncienneCNI_test
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2370042642818659689l);

super.setChecksum("618718268");

super.setNom("FEN_AncienneCNI_test");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0x0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(650, 360);

super.setTitre("AncienneCNI_test");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_AncienneCNI_test
////////////////////////////////////////////////////////////////////////////
mWD_CAM_ANCIENNE_CNI.initialiserObjet();
super.ajouter("CAM_ANCIENNE_CNI", mWD_CAM_ANCIENNE_CNI);
mWD_BTN_Flottant.initialiserObjet();
super.ajouter("BTN_Flottant", mWD_BTN_Flottant);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_LIB_SansNom2.initialiserObjet();
super.ajouter("LIB_SansNom2", mWD_LIB_SansNom2);
mWD_LIB_SansNom3.initialiserObjet();
super.ajouter("LIB_SansNom3", mWD_LIB_SansNom3);
mWD_BTN_R1.initialiserObjet();
super.ajouter("BTN_R1", mWD_BTN_R1);
mWD_LIB_positionIMG1.initialiserObjet();
super.ajouter("LIB_positionIMG1", mWD_LIB_positionIMG1);
mWD_LIB_enregistrement_en_cours.initialiserObjet();
super.ajouter("LIB_enregistrement_en_cours", mWD_LIB_enregistrement_en_cours);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPCapture_piece_d_identite.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPCapture_piece_d_identite.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPCapture_piece_d_identite.getInstance().mWD_FEN_AncienneCNI_test;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "250 PHOENIX#WM";
}
}
