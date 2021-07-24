/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_QRCODE
 * Date : 05/07/2021 19:10:35
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.camera.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.media.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_QRCODE extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_QRCODE
////////////////////////////////////////////////////////////////////////////

/**
 * CAM_SansNom1
 */
class GWDCAM_SansNom1 extends WDChampCamera
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_QRCODE.CAM_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2369802468282843580l);

super.setChecksum("649799494");

super.setNom("CAM_SansNom1");

super.setType(24);

super.setBulle("");

super.setLibelle("");

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleurFond(0xF5F5F5);

super.setEtatInitial(0);

super.setPositionInitiale(19, 132);

super.setTailleInitiale(322, 305);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setParamDecodageCodeBarres(3, 23, 70);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xE0DCDA, 0x605C5A, 0xF5F5F5, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Décodage d'un code-barres depuis CAM_SansNom1
 */
public WDObjet decodageCodeBarres(){ setCallbackPCodeDecodage("fWD_decodageCodeBarres"); return new WDVoid("fWD_decodageCodeBarres"); }
public WDObjet fWD_decodageCodeBarres( WDObjet vWD_cb )
{
// PROCÉDURE DécodeCodeBarre(cb est un CodeBarres)



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_valeurCodeBarre = new WDChaineU();



vWD_cb = WDParametre.traiterParametreClasse(vWD_cb, 1, false, WDCodeBarres.class, 111);


// valeurCodeBarre est une chaîne


// valeurCodeBarre = cb..ValeurBrute
vWD_valeurCodeBarre.setValeur(vWD_cb.getProp(EWDPropriete.PROP_VALEURBRUTE));

// Info(valeurCodeBarre)
WDAPIDialogue.info(vWD_valeurCodeBarre.getString());

// OuvreFenêtreMobile(FEN_choixDocument,valeurCodeBarre)
WDAPIFenetre.ouvreFille(GWDPCapture_piece_d_identite.getInstance().mWD_FEN_choixDocument,new WDObjet[] {vWD_valeurCodeBarre} );

return new WDVoid("fWD_decodageCodeBarres");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCAM_SansNom1 mWD_CAM_SansNom1;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_QRCODE.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xC94440, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_QRCODE
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_QRCODE
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_CAM_SansNom1 = new GWDCAM_SansNom1();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_QRCODE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2369801935672565537l);

super.setChecksum("621505096");

super.setNom("FEN_QRCODE");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0x0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 569);

super.setTitre("QRCODE");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0x68635F);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_QRCODE
////////////////////////////////////////////////////////////////////////////
mWD_CAM_SansNom1.initialiserObjet();
super.ajouter("CAM_SansNom1", mWD_CAM_SansNom1);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

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
return 1;
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
return true;
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
return GWDPCapture_piece_d_identite.getInstance().mWD_FEN_QRCODE;
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
