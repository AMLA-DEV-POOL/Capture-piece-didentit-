/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_choixDocument
 * Date : 23/07/2021 18:32:31
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_choixDocument extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_choixDocument
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Libellé
 */
class GWDLIB_Libelle extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_choixDocument.LIB_Libellé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367834665150350930l);

super.setChecksum("1208010943");

super.setNom("LIB_Libellé");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-2, 0);

super.setTailleInitiale(364, 169);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, 0xC94440, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xC94440, 0x490000, 0xC94440, 2.000000, 25.000000, 1, 1), 0, 0, 0, 0);

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
public GWDLIB_Libelle mWD_LIB_Libelle;

/**
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_choixDocument.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367834673740680707l);

super.setChecksum("1208408410");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(17, 9);

super.setTailleInitiale(47, 64);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\fondimg1@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom3 mWD_IMG_SansNom3;

/**
 * IMG_SansNom4
 */
class GWDIMG_SansNom4 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_choixDocument.IMG_SansNom4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367834673740942882l);

super.setChecksum("1208670585");

super.setNom("IMG_SansNom4");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(78, 64);

super.setTailleInitiale(31, 25);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\forme0@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom4 mWD_IMG_SansNom4;

/**
 * IMG_SansNom7
 */
class GWDIMG_SansNom7 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_choixDocument.IMG_SansNom7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367834673741205057l);

super.setChecksum("1208932760");

super.setNom("IMG_SansNom7");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(93, 113);

super.setTailleInitiale(39, 29);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\forme0@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom7 mWD_IMG_SansNom7;

/**
 * IMG_SansNom8
 */
class GWDIMG_SansNom8 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_choixDocument.IMG_SansNom8
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367834673741467217l);

super.setChecksum("1209194920");

super.setNom("IMG_SansNom8");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(201, 12);

super.setTailleInitiale(150, 150);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\forme0@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom8 mWD_IMG_SansNom8;

/**
 * LIB_Piece_d_identité
 */
class GWDLIB_Piece_d_identite extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_choixDocument.LIB_Piece_d_identité
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305156660689l);

super.setChecksum("1264193747");

super.setNom("LIB_Piece_d_identité");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Pièce d'identité");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(16, 197);

super.setTailleInitiale(120, 16);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x262626, 0);

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
public GWDLIB_Piece_d_identite mWD_LIB_Piece_d_identite;

/**
 * LIB_Capture_des_documents
 */
class GWDLIB_Capture_des_documents extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_choixDocument.LIB_Capture_des_documents
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305156791776l);

super.setChecksum("1264324834");

super.setNom("LIB_Capture_des_documents");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Capture des documents");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(16, 177);

super.setTailleInitiale(206, 19);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x262626, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x262626, 0);

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
public GWDLIB_Capture_des_documents mWD_LIB_Capture_des_documents;

/**
 * IMG_SansNom64
 */
class GWDIMG_SansNom64 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_choixDocument.IMG_SansNom64
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305159020250l);

super.setChecksum("1266555588");

super.setNom("IMG_SansNom64");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(31, 333);

super.setTailleInitiale(32, 33);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\LIN_Copyright-Sharring-Rights@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom64 mWD_IMG_SansNom64;

/**
 * IMG_SansNom65
 */
class GWDIMG_SansNom65 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_choixDocument.IMG_SansNom65
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305159282426l);

super.setChecksum("1266817764");

super.setNom("IMG_SansNom65");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(284, 335);

super.setTailleInitiale(26, 28);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\arrow@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom65 mWD_IMG_SansNom65;

/**
 * IMG_SansNom66
 */
class GWDIMG_SansNom66 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_choixDocument.IMG_SansNom66
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305159544585l);

super.setChecksum("1267079923");

super.setNom("IMG_SansNom66");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(284, 414);

super.setTailleInitiale(26, 28);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\arrow@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom66 mWD_IMG_SansNom66;

/**
 * IMG_SansNom67
 */
class GWDIMG_SansNom67 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_choixDocument.IMG_SansNom67
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305159806745l);

super.setChecksum("1267342083");

super.setNom("IMG_SansNom67");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(31, 412);

super.setTailleInitiale(32, 33);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\LIN_Copyright-Sharring-Rights@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom67 mWD_IMG_SansNom67;

/**
 * IMG_SansNom68
 */
class GWDIMG_SansNom68 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_choixDocument.IMG_SansNom68
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305160068905l);

super.setChecksum("1267604243");

super.setNom("IMG_SansNom68");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(284, 493);

super.setTailleInitiale(26, 28);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\arrow@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom68 mWD_IMG_SansNom68;

/**
 * IMG_SansNom69
 */
class GWDIMG_SansNom69 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_choixDocument.IMG_SansNom69
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305160331064l);

super.setChecksum("1267866402");

super.setNom("IMG_SansNom69");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(31, 491);

super.setTailleInitiale(32, 33);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\LIN_Copyright-Sharring-Rights@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom69 mWD_IMG_SansNom69;

/**
 * IMG_SansNom70
 */
class GWDIMG_SansNom70 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_choixDocument.IMG_SansNom70
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305160593224l);

super.setChecksum("1268128562");

super.setNom("IMG_SansNom70");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(284, 573);

super.setTailleInitiale(26, 28);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\arrow@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom70 mWD_IMG_SansNom70;

/**
 * IMG_SansNom71
 */
class GWDIMG_SansNom71 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_choixDocument.IMG_SansNom71
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305160855399l);

super.setChecksum("1268390737");

super.setNom("IMG_SansNom71");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(31, 571);

super.setTailleInitiale(32, 33);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\LIN_Copyright-Sharring-Rights@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom71 mWD_IMG_SansNom71;

/**
 * IMG_SansNom72
 */
class GWDIMG_SansNom72 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de FEN_choixDocument.IMG_SansNom72
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305161117559l);

super.setChecksum("1268652897");

super.setNom("IMG_SansNom72");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(284, 650);

super.setTailleInitiale(26, 28);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\arrow@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom72 mWD_IMG_SansNom72;

/**
 * IMG_SansNom73
 */
class GWDIMG_SansNom73 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de FEN_choixDocument.IMG_SansNom73
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305161379718l);

super.setChecksum("1268915056");

super.setNom("IMG_SansNom73");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(31, 648);

super.setTailleInitiale(32, 33);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\LIN_Copyright-Sharring-Rights@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(17);

super.setAncrageInitial(0, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x262626);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom73 mWD_IMG_SansNom73;

/**
 * BTN_Nouvelle_CNI1
 */
class GWDBTN_Nouvelle_CNI1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de FEN_choixDocument.BTN_Nouvelle_CNI1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835309457133493l);

super.setChecksum("1269699712");

super.setNom("BTN_Nouvelle_CNI1");

super.setType(4);

super.setBulle("");

super.setLibelle("Nouvelle CNI");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 419);

super.setTailleInitiale(198, 21);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(18);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Nouvelle_CNI1 mWD_BTN_Nouvelle_CNI1;

/**
 * BTN_Récépissé_CNI1
 */
class GWDBTN_Recepisse_CNI1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de FEN_choixDocument.BTN_Récépissé_CNI1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835309457264581l);

super.setChecksum("1269830800");

super.setNom("BTN_Récépissé_CNI1");

super.setType(4);

super.setBulle("");

super.setLibelle("Récépissé CNI");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 498);

super.setTailleInitiale(198, 21);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(19);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Recepisse_CNI1 mWD_BTN_Recepisse_CNI1;

/**
 * BTN_Passeport1
 */
class GWDBTN_Passeport1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°20 de FEN_choixDocument.BTN_Passeport1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835309457395668l);

super.setChecksum("1269961887");

super.setNom("BTN_Passeport1");

super.setType(4);

super.setBulle("");

super.setLibelle("Passeport");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 578);

super.setTailleInitiale(198, 21);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(20);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(10);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Passeport1 mWD_BTN_Passeport1;

/**
 * BTN_Permis_de_conduire1
 */
class GWDBTN_Permis_de_conduire1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°21 de FEN_choixDocument.BTN_Permis_de_conduire1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835309457526756l);

super.setChecksum("1270092975");

super.setNom("BTN_Permis_de_conduire1");

super.setType(4);

super.setBulle("");

super.setLibelle("Permis de conduire");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(78, 655);

super.setTailleInitiale(198, 21);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(21);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(12);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Permis_de_conduire1 mWD_BTN_Permis_de_conduire1;

/**
 * BTN_Ancienne_CNI1
 */
class GWDBTN_Ancienne_CNI1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°22 de FEN_choixDocument.BTN_Ancienne_CNI1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835309457788931l);

super.setChecksum("1270355150");

super.setNom("BTN_Ancienne_CNI1");

super.setType(4);

super.setBulle("");

super.setLibelle("Ancienne  CNI");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(71, 339);

super.setTailleInitiale(198, 21);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(22);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(0);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0x262626, creerPolice_GEN("Roboto", -7.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond("", 1, 0, 2, 1);

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
public GWDBTN_Ancienne_CNI1 mWD_BTN_Ancienne_CNI1;

/**
 * SAI_Entrer_votre_numero_de_ference
 */
class GWDSAI_Entrer_votre_numero_de_ference extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°23 de FEN_choixDocument.SAI_Entrer_votre_numero_de_ference
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,265,21);
super.setRectCompPrincipal(0,21,265,40);
super.setQuid(2367835945118471504l);

super.setChecksum("1275877151");

super.setNom("SAI_Entrer_votre_numero_de_ference");

super.setType(20001);

super.setBulle("");

super.setLibelle("Entrer votre numéro de référence");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 239);

super.setTailleInitiale(265, 63);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(23);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(true);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes Projets Mobile\\Capture pièce d'identité\\Gabarits\\WM\\250 Phoenix\\Phoenix_Edt@dpi1x.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFF, 1, 5));

super.setStyleSaisie(0x0, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SAI_Entrer_votre_numero_de_ference
 */
public void modification()
{
super.modification();

// 


// MoiMême.Taille = 14
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_TAILLE,14);

// si Taille(MoiMême) = 4 ou Taille(MoiMême) = 9 alors
if((WDAPIChaine.taille(WDContexte.getMoiMeme()).opEgal(4, 0) | WDAPIChaine.taille(WDContexte.getMoiMeme()).opEgal(9, 0)))
{
// 	MoiMême				= MoiMême +"-"
WDContexte.getMoiMeme().setValeur(WDContexte.getMoiMeme().opPlus("-"));

// 	MoiMême.Curseur 	= Taille(MoiMême) + 1
WDContexte.getMoiMeme().setProp(EWDPropriete.PROP_CURSEUR,WDAPIChaine.taille(WDContexte.getMoiMeme()).opPlus(1));

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Entrer_votre_numero_de_ference mWD_SAI_Entrer_votre_numero_de_ference;

/**
 * BTN_SansNom28
 */
class GWDBTN_SansNom28 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°24 de FEN_choixDocument.BTN_SansNom28
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305158626988l);

super.setChecksum("1266160502");

super.setNom("BTN_SansNom28");

super.setType(4);

super.setBulle("");

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(17, 479);

super.setTailleInitiale(323, 56);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(24);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom28
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// SI SAI_Entrer_votre_numero_de_ference = "" ALORS
if(mWD_SAI_Entrer_votre_numero_de_ference.opEgal("", 0))
{
// 	Info("Le champ Référence doit être renseigné.")
WDAPIDialogue.info("Le champ Référence doit être renseigné.");

// 	RETOUR
return;

}
else
{
// 	SI VerifierReferenceUtilisateur(SAI_Entrer_votre_numero_de_ference) ALORS
if(GWDCPCOL_ProceduresGlobales.fWD_verifierReferenceUtilisateur(mWD_SAI_Entrer_votre_numero_de_ference).getBoolean())
{
// 		OuvreFenêtreMobile(FEN_Récépissé,SAI_Entrer_votre_numero_de_ference)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_Recepisse,new WDObjet[] {mWD_SAI_Entrer_votre_numero_de_ference} );

}
else
{
// 		Info("la Référence n'existe pas")
WDAPIDialogue.info("la Référence n'existe pas");

}

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
public GWDBTN_SansNom28 mWD_BTN_SansNom28;

/**
 * BTN_SansNom30
 */
class GWDBTN_SansNom30 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°25 de FEN_choixDocument.BTN_SansNom30
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305158889163l);

super.setChecksum("1266422677");

super.setNom("BTN_SansNom30");

super.setType(4);

super.setBulle("");

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 321);

super.setTailleInitiale(323, 56);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(25);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom30
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// SI SAI_Entrer_votre_numero_de_ference = "" ALORS
if(mWD_SAI_Entrer_votre_numero_de_ference.opEgal("", 0))
{
// 	Info("Le champ Référence doit être renseigné.")
WDAPIDialogue.info("Le champ Référence doit être renseigné.");

// 	RETOUR
return;

}
else
{
// 	SI VerifierReferenceUtilisateur(SAI_Entrer_votre_numero_de_ference) ALORS
if(GWDCPCOL_ProceduresGlobales.fWD_verifierReferenceUtilisateur(mWD_SAI_Entrer_votre_numero_de_ference).getBoolean())
{
// 		OuvreFenêtreMobile(FEN_AncienneCNI,SAI_Entrer_votre_numero_de_ference)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_AncienneCNI,new WDObjet[] {mWD_SAI_Entrer_votre_numero_de_ference} );

}
else
{
// 		Info("la Référence n'existe pas")
WDAPIDialogue.info("la Référence n'existe pas");

}

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
public GWDBTN_SansNom30 mWD_BTN_SansNom30;

/**
 * BTN_SansNom29
 */
class GWDBTN_SansNom29 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°26 de FEN_choixDocument.BTN_SansNom29
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305158758075l);

super.setChecksum("1266291589");

super.setNom("BTN_SansNom29");

super.setType(4);

super.setBulle("");

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 400);

super.setTailleInitiale(323, 56);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(26);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom29
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// SI SAI_Entrer_votre_numero_de_ference = "" ALORS
if(mWD_SAI_Entrer_votre_numero_de_ference.opEgal("", 0))
{
// 	Info("Le champ Référence doit être renseigné.")
WDAPIDialogue.info("Le champ Référence doit être renseigné.");

// 	RETOUR
return;

}
else
{
// 	SI VerifierReferenceUtilisateur(SAI_Entrer_votre_numero_de_ference) ALORS
if(GWDCPCOL_ProceduresGlobales.fWD_verifierReferenceUtilisateur(mWD_SAI_Entrer_votre_numero_de_ference).getBoolean())
{
// 		OuvreFenêtreMobile(FEN_NouvelleCNI,SAI_Entrer_votre_numero_de_ference)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_NouvelleCNI,new WDObjet[] {mWD_SAI_Entrer_votre_numero_de_ference} );

}
else
{
// 		Info("la Référence n'existe pas")
WDAPIDialogue.info("la Référence n'existe pas");

}

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
public GWDBTN_SansNom29 mWD_BTN_SansNom29;

/**
 * BTN_SansNom27
 */
class GWDBTN_SansNom27 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°27 de FEN_choixDocument.BTN_SansNom27
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305158495900l);

super.setChecksum("1266029414");

super.setNom("BTN_SansNom27");

super.setType(4);

super.setBulle("");

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(16, 558);

super.setTailleInitiale(323, 56);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(27);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom27
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// SI SAI_Entrer_votre_numero_de_ference = "" ALORS
if(mWD_SAI_Entrer_votre_numero_de_ference.opEgal("", 0))
{
// 	Info("Le champ Référence doit être renseigné.")
WDAPIDialogue.info("Le champ Référence doit être renseigné.");

// 	RETOUR
return;

}
else
{
// 	SI VerifierReferenceUtilisateur(SAI_Entrer_votre_numero_de_ference) ALORS
if(GWDCPCOL_ProceduresGlobales.fWD_verifierReferenceUtilisateur(mWD_SAI_Entrer_votre_numero_de_ference).getBoolean())
{
// 		OuvreFenêtreMobile(FEN_Passeport,SAI_Entrer_votre_numero_de_ference)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_Passeport,new WDObjet[] {mWD_SAI_Entrer_votre_numero_de_ference} );

}
else
{
// 		Info("la Référence n'existe pas")
WDAPIDialogue.info("la Référence n'existe pas");

}

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
public GWDBTN_SansNom27 mWD_BTN_SansNom27;

/**
 * BTN_SansNom26
 */
class GWDBTN_SansNom26 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°28 de FEN_choixDocument.BTN_SansNom26
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2367835305158364828l);

super.setChecksum("1265898342");

super.setNom("BTN_SansNom26");

super.setType(4);

super.setBulle("");

super.setLibelle("Bouton");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(17, 637);

super.setTailleInitiale(323, 56);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(28);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(11);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleSurvol(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setStyleLibelleEnfonce(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x262626);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(27, 0xDBDBDB, 0x5B5B5B, 0xFFFFFFFF, 4.000000, 4.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom26
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// SI SAI_Entrer_votre_numero_de_ference = "" ALORS
if(mWD_SAI_Entrer_votre_numero_de_ference.opEgal("", 0))
{
// 	Info("Le champ Référence doit être renseigné.")
WDAPIDialogue.info("Le champ Référence doit être renseigné.");

// 	RETOUR
return;

}
else
{
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
public GWDBTN_SansNom26 mWD_BTN_SansNom26;

/**
 * BTN_QR
 */
class GWDBTN_QR extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°29 de FEN_choixDocument.BTN_QR
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2369801562008358111l);

super.setChecksum("613404150");

super.setNom("BTN_QR");

super.setType(4);

super.setBulle("");

super.setLibelle("QR");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(298, 262);

super.setTailleInitiale(41, 40);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(29);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes Projets Mobile\\Capture pièce d'identité\\codecap@dpi1x.png", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes Projets Mobile\\Capture pièce d'identité\\ocr@dpi1x1.png?_3NP_10_10_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_QR
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_QRCODE, Paramètre 1, Paramètre N)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_QRCODE);

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
public GWDBTN_QR mWD_BTN_QR;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°30 de FEN_choixDocument.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376467647554109461l);

super.setChecksum("564573969");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(149, 50);

super.setTailleInitiale(60, 60);

super.setValeurInitiale("E:\\Mes Projets Mobile\\Capture pièce d'identité\\capture1@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(30);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

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
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * Traitement: Déclarations globales de FEN_choixDocument
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre(gCodeQr = "")
super.declarerGlobale(WD_tabParam, 0, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gCodeQr = WD_tabParam[0];
}
else { vWD_gCodeQr = new WDChaineU(""); }
super.ajouterVariableGlobale("gCodeQr",vWD_gCodeQr);



// SI gCodeQr <> "" ALORS
if(vWD_gCodeQr.opDiff(""))
{
// 	SAI_Entrer_votre_numero_de_ference = gCodeQr
mWD_SAI_Entrer_votre_numero_de_ference.setValeur(vWD_gCodeQr);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gCodeQr = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_choixDocument
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_LIB_Libelle = new GWDLIB_Libelle();
mWD_IMG_SansNom3 = new GWDIMG_SansNom3();
mWD_IMG_SansNom4 = new GWDIMG_SansNom4();
mWD_IMG_SansNom7 = new GWDIMG_SansNom7();
mWD_IMG_SansNom8 = new GWDIMG_SansNom8();
mWD_LIB_Piece_d_identite = new GWDLIB_Piece_d_identite();
mWD_LIB_Capture_des_documents = new GWDLIB_Capture_des_documents();
mWD_IMG_SansNom64 = new GWDIMG_SansNom64();
mWD_IMG_SansNom65 = new GWDIMG_SansNom65();
mWD_IMG_SansNom66 = new GWDIMG_SansNom66();
mWD_IMG_SansNom67 = new GWDIMG_SansNom67();
mWD_IMG_SansNom68 = new GWDIMG_SansNom68();
mWD_IMG_SansNom69 = new GWDIMG_SansNom69();
mWD_IMG_SansNom70 = new GWDIMG_SansNom70();
mWD_IMG_SansNom71 = new GWDIMG_SansNom71();
mWD_IMG_SansNom72 = new GWDIMG_SansNom72();
mWD_IMG_SansNom73 = new GWDIMG_SansNom73();
mWD_BTN_Nouvelle_CNI1 = new GWDBTN_Nouvelle_CNI1();
mWD_BTN_Recepisse_CNI1 = new GWDBTN_Recepisse_CNI1();
mWD_BTN_Passeport1 = new GWDBTN_Passeport1();
mWD_BTN_Permis_de_conduire1 = new GWDBTN_Permis_de_conduire1();
mWD_BTN_Ancienne_CNI1 = new GWDBTN_Ancienne_CNI1();
mWD_SAI_Entrer_votre_numero_de_ference = new GWDSAI_Entrer_votre_numero_de_ference();
mWD_BTN_SansNom28 = new GWDBTN_SansNom28();
mWD_BTN_SansNom30 = new GWDBTN_SansNom30();
mWD_BTN_SansNom29 = new GWDBTN_SansNom29();
mWD_BTN_SansNom27 = new GWDBTN_SansNom27();
mWD_BTN_SansNom26 = new GWDBTN_SansNom26();
mWD_BTN_QR = new GWDBTN_QR();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_choixDocument
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2367833149026411620l);

super.setChecksum("1215185409");

super.setNom("FEN_choixDocument");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 730);

super.setTitre("Choix du document");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xC94440);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_choixDocument
////////////////////////////////////////////////////////////////////////////
mWD_LIB_Libelle.initialiserObjet();
super.ajouter("LIB_Libellé", mWD_LIB_Libelle);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouter("IMG_SansNom3", mWD_IMG_SansNom3);
mWD_IMG_SansNom4.initialiserObjet();
super.ajouter("IMG_SansNom4", mWD_IMG_SansNom4);
mWD_IMG_SansNom7.initialiserObjet();
super.ajouter("IMG_SansNom7", mWD_IMG_SansNom7);
mWD_IMG_SansNom8.initialiserObjet();
super.ajouter("IMG_SansNom8", mWD_IMG_SansNom8);
mWD_LIB_Piece_d_identite.initialiserObjet();
super.ajouter("LIB_Piece_d_identité", mWD_LIB_Piece_d_identite);
mWD_LIB_Capture_des_documents.initialiserObjet();
super.ajouter("LIB_Capture_des_documents", mWD_LIB_Capture_des_documents);
mWD_IMG_SansNom64.initialiserObjet();
super.ajouter("IMG_SansNom64", mWD_IMG_SansNom64);
mWD_IMG_SansNom65.initialiserObjet();
super.ajouter("IMG_SansNom65", mWD_IMG_SansNom65);
mWD_IMG_SansNom66.initialiserObjet();
super.ajouter("IMG_SansNom66", mWD_IMG_SansNom66);
mWD_IMG_SansNom67.initialiserObjet();
super.ajouter("IMG_SansNom67", mWD_IMG_SansNom67);
mWD_IMG_SansNom68.initialiserObjet();
super.ajouter("IMG_SansNom68", mWD_IMG_SansNom68);
mWD_IMG_SansNom69.initialiserObjet();
super.ajouter("IMG_SansNom69", mWD_IMG_SansNom69);
mWD_IMG_SansNom70.initialiserObjet();
super.ajouter("IMG_SansNom70", mWD_IMG_SansNom70);
mWD_IMG_SansNom71.initialiserObjet();
super.ajouter("IMG_SansNom71", mWD_IMG_SansNom71);
mWD_IMG_SansNom72.initialiserObjet();
super.ajouter("IMG_SansNom72", mWD_IMG_SansNom72);
mWD_IMG_SansNom73.initialiserObjet();
super.ajouter("IMG_SansNom73", mWD_IMG_SansNom73);
mWD_BTN_Nouvelle_CNI1.initialiserObjet();
super.ajouter("BTN_Nouvelle_CNI1", mWD_BTN_Nouvelle_CNI1);
mWD_BTN_Recepisse_CNI1.initialiserObjet();
super.ajouter("BTN_Récépissé_CNI1", mWD_BTN_Recepisse_CNI1);
mWD_BTN_Passeport1.initialiserObjet();
super.ajouter("BTN_Passeport1", mWD_BTN_Passeport1);
mWD_BTN_Permis_de_conduire1.initialiserObjet();
super.ajouter("BTN_Permis_de_conduire1", mWD_BTN_Permis_de_conduire1);
mWD_BTN_Ancienne_CNI1.initialiserObjet();
super.ajouter("BTN_Ancienne_CNI1", mWD_BTN_Ancienne_CNI1);
mWD_SAI_Entrer_votre_numero_de_ference.initialiserObjet();
super.ajouter("SAI_Entrer_votre_numero_de_ference", mWD_SAI_Entrer_votre_numero_de_ference);
mWD_BTN_SansNom28.initialiserObjet();
super.ajouter("BTN_SansNom28", mWD_BTN_SansNom28);
mWD_BTN_SansNom30.initialiserObjet();
super.ajouter("BTN_SansNom30", mWD_BTN_SansNom30);
mWD_BTN_SansNom29.initialiserObjet();
super.ajouter("BTN_SansNom29", mWD_BTN_SansNom29);
mWD_BTN_SansNom27.initialiserObjet();
super.ajouter("BTN_SansNom27", mWD_BTN_SansNom27);
mWD_BTN_SansNom26.initialiserObjet();
super.ajouter("BTN_SansNom26", mWD_BTN_SansNom26);
mWD_BTN_QR.initialiserObjet();
super.ajouter("BTN_QR", mWD_BTN_QR);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);

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
return 1;
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
return GWDPCapture_piece_d_identite.getInstance().mWD_FEN_choixDocument;
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
