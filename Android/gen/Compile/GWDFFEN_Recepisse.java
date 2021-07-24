/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Récépissé
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
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.dessin.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Recepisse extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Récépissé
////////////////////////////////////////////////////////////////////////////

/**
 * CAM_ANCIENNE_CNI
 */
class GWDCAM_ANCIENNE_CNI extends WDChampCamera
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Récépissé.CAM_ANCIENNE_CNI
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2368245753027686335l);

super.setChecksum("585682294");

super.setNom("CAM_ANCIENNE_CNI");

super.setType(24);

super.setBulle("");

super.setLibelle("");

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleurFond(0x0);

super.setEtatInitial(0);

super.setPositionInitiale(7, 24);

super.setTailleInitiale(346, 494);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAncrageInitial(4, 1000, 1000, 500, 500, 0);

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
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Récépissé.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2368245753027817439l);

super.setChecksum("585803822");

super.setNom("LIB_SansNom1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(44, 42);

super.setTailleInitiale(273, 456);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 500, 0);

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
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Récépissé.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2368245753028210670l);

super.setChecksum("586197509");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(151, 548);

super.setTailleInitiale(58, 55);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(5, 1000, 1000, 500, 1000, 0);

super.setNumTab(1);

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


// SI gsRefUtilisate <> "" ALORS
if(vWD_gsRefUtilisate.opDiff(""))
{
// 	gsRefUtilisate			=  gsRefUtilisate
vWD_gsRefUtilisate.setValeur(vWD_gsRefUtilisate);

// 	gsReferenceUtilisateur	= gsRefUtilisate
GWDPCapture_piece_d_identite.getInstance().vWD_gsReferenceUtilisateur.setValeur(vWD_gsRefUtilisate);

}
else
{
// 	gsRefUtilisate = "00000AA"
vWD_gsRefUtilisate.setValeur("00000AA");

}

// bResSauvegarde	est un booléen


// CNIAV			est une Image
vWD_CNIAV = new WDInstance( new WDImage() );


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

// 		bResSauvegarde = CaméraCapture(CAM_ANCIENNE_CNI,SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"Recepisse"+[fSep()]+"recepisse_"+gsRefUtilisate+".jpeg",viCaptureImage,1)
vWD_bResSauvegarde.setValeur(WDAPICamera.videoCapture(mWD_CAM_ANCIENNE_CNI,WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("Recepisse").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("recepisse_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg").getString(),2,new WDEntier4(1)));

// 		SI bResSauvegarde = Vrai ALORS
if(vWD_bResSauvegarde.opEgal(true, 0))
{
// 			CNIAV = SysRepCarteStockage()+[fSep()]+"checktatoSV_IMG"+[fSep()]+"Recepisse"+[fSep()]+"recepisse_"+gsRefUtilisate+".jpeg"
vWD_CNIAV.setValeur(WDAPISys.sysRepCarteStockage().opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("checktatoSV_IMG").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("Recepisse").opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus("recepisse_").opPlus(vWD_gsRefUtilisate).opPlus(".jpeg"));

// 			Info(EnregistrerImage(CNIAV,"Recepisse_"+gsRefUtilisate,"jpeg","Recepisse",gsRefUtilisate))
WDAPIDialogue.info(GWDCPCOL_ProceduresGlobales.fWD_enregistrerImage(vWD_CNIAV,new WDChaineU("Recepisse_").opPlus(vWD_gsRefUtilisate),new WDChaineU("jpeg"),new WDChaineU("Recepisse"),vWD_gsRefUtilisate).getString());

// 			LIB_enregistrement_en_cours..VisibleAvecAnimation = faux
mWD_LIB_enregistrement_en_cours.setProp(EWDPropriete.PROP_VISIBLEAVECANIMATION,false);

// 			SI OuiNon("Voulez-vous faire une autre capture ?") = Oui ALORS
if(WDAPIDialogue.ouiNon("Voulez-vous faire une autre capture ?").opEgal(1, 0))
{
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
 * LIB_SansNom3
 */
class GWDLIB_SansNom3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Récépissé.LIB_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2368255970775612537l);

super.setChecksum("606404115");

super.setNom("LIB_SansNom3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Libellé");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(238, 185);

super.setTailleInitiale(78, 97);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(4);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xC94440, 0x490000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

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
 * LIB_enregistrement_en_cours
 */
class GWDLIB_enregistrement_en_cours extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Récépissé.LIB_enregistrement_en_cours
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2368537759265413490l);

super.setChecksum("586947413");

super.setNom("LIB_enregistrement_en_cours");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Enregistrement en cours...");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(53, 298);

super.setTailleInitiale(239, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(5);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Déclarations globales de FEN_Récépissé
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
// Création des champs de la fenêtre FEN_Récépissé
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_CAM_ANCIENNE_CNI = new GWDCAM_ANCIENNE_CNI();
mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_LIB_SansNom3 = new GWDLIB_SansNom3();
mWD_LIB_enregistrement_en_cours = new GWDLIB_enregistrement_en_cours();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Récépissé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2367897654502658634l);

super.setChecksum("576838818");

super.setNom("FEN_Récépissé");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0x0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 651);

super.setTitre("Récépissé");

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
// Initialisation des champs de FEN_Récépissé
////////////////////////////////////////////////////////////////////////////
mWD_CAM_ANCIENNE_CNI.initialiserObjet();
super.ajouter("CAM_ANCIENNE_CNI", mWD_CAM_ANCIENNE_CNI);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
mWD_BTN_Flottant.initialiserObjet();
super.ajouter("BTN_Flottant", mWD_BTN_Flottant);
mWD_LIB_SansNom3.initialiserObjet();
super.ajouter("LIB_SansNom3", mWD_LIB_SansNom3);
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
return GWDPCapture_piece_d_identite.getInstance().mWD_FEN_Recepisse;
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
