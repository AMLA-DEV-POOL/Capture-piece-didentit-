/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Capture pièce d'identité
 * Date : 23/07/2021 18:32:31
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ws.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPCapture_piece_d_identite extends WDProjet
{
private static GWDPCapture_piece_d_identite ms_instance = null;
/**
 * Accès au projet: Capture pièce d'identité
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPCapture_piece_d_identite.getInstance()
 */
public static GWDPCapture_piece_d_identite getInstance()
{
return (GWDPCapture_piece_d_identite) ms_instance;
}

 // FEN_choixDocument
public GWDFFEN_choixDocument mWD_FEN_choixDocument = new GWDFFEN_choixDocument();
 // accesseur de FEN_choixDocument
public GWDFFEN_choixDocument getFEN_choixDocument()
{
mWD_FEN_choixDocument.checkOuverture();
return mWD_FEN_choixDocument;
}

 // FEN_NouvelleCNI
public GWDFFEN_NouvelleCNI mWD_FEN_NouvelleCNI = new GWDFFEN_NouvelleCNI();
 // accesseur de FEN_NouvelleCNI
public GWDFFEN_NouvelleCNI getFEN_NouvelleCNI()
{
mWD_FEN_NouvelleCNI.checkOuverture();
return mWD_FEN_NouvelleCNI;
}

 // FEN_Passeport
public GWDFFEN_Passeport mWD_FEN_Passeport = new GWDFFEN_Passeport();
 // accesseur de FEN_Passeport
public GWDFFEN_Passeport getFEN_Passeport()
{
mWD_FEN_Passeport.checkOuverture();
return mWD_FEN_Passeport;
}

 // FEN_Permits_de_conduire
public GWDFFEN_Permits_de_conduire mWD_FEN_Permits_de_conduire = new GWDFFEN_Permits_de_conduire();
 // accesseur de FEN_Permits_de_conduire
public GWDFFEN_Permits_de_conduire getFEN_Permits_de_conduire()
{
mWD_FEN_Permits_de_conduire.checkOuverture();
return mWD_FEN_Permits_de_conduire;
}

 // FEN_Récépissé
public GWDFFEN_Recepisse mWD_FEN_Recepisse = new GWDFFEN_Recepisse();
 // accesseur de FEN_Récépissé
public GWDFFEN_Recepisse getFEN_Recepisse()
{
mWD_FEN_Recepisse.checkOuverture();
return mWD_FEN_Recepisse;
}

 // FEN_AncienneCNI
public GWDFFEN_AncienneCNI mWD_FEN_AncienneCNI = new GWDFFEN_AncienneCNI();
 // accesseur de FEN_AncienneCNI
public GWDFFEN_AncienneCNI getFEN_AncienneCNI()
{
mWD_FEN_AncienneCNI.checkOuverture();
return mWD_FEN_AncienneCNI;
}

 // FEN_QRCODE
public GWDFFEN_QRCODE mWD_FEN_QRCODE = new GWDFFEN_QRCODE();
 // accesseur de FEN_QRCODE
public GWDFFEN_QRCODE getFEN_QRCODE()
{
mWD_FEN_QRCODE.checkOuverture();
return mWD_FEN_QRCODE;
}

 // FEN_AncienneCNI_test
public GWDFFEN_AncienneCNI_test mWD_FEN_AncienneCNI_test = new GWDFFEN_AncienneCNI_test();
 // accesseur de FEN_AncienneCNI_test
public GWDFFEN_AncienneCNI_test getFEN_AncienneCNI_test()
{
mWD_FEN_AncienneCNI_test.checkOuverture();
return mWD_FEN_AncienneCNI_test;
}


 // Constructeur de la classe GWDPCapture_piece_d_identite
public GWDPCapture_piece_d_identite()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
ajouterCollectionProcedures(GWDCPCOL_ProceduresGlobales.getInstance());
ajouterCollectionProcedures(GWDCPCOL_Push.getInstance());

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0xF48542, 0x313FD2, 0xA6F2, 0x4F900D, 0xA95CF8, 0xB86592, 0xB74A5E, 0xA5A595, 0x654E44, 0x383838, 0x0});
ajouterFenetre("FEN_choixDocument", mWD_FEN_choixDocument);
ajouterFenetre("FEN_NouvelleCNI", mWD_FEN_NouvelleCNI);
ajouterFenetre("FEN_Passeport", mWD_FEN_Passeport);
ajouterFenetre("FEN_Permits_de_conduire", mWD_FEN_Permits_de_conduire);
ajouterFenetre("FEN_Récépissé", mWD_FEN_Recepisse);
ajouterFenetre("FEN_AncienneCNI", mWD_FEN_AncienneCNI);
ajouterFenetre("FEN_QRCODE", mWD_FEN_QRCODE);
ajouterFenetre("FEN_AncienneCNI_test", mWD_FEN_AncienneCNI_test);

// Exportation des WebServices
WDWSManager.declarerWebService("WD_Serveur_Push", "E:\\Mes Projets Mobile\\Capture pièce d'identité\\WD_Serveur_Push.wdsdl");


}

// Code de déclaration de Capture pièce d'identité
public void trtInitProjet()
{
// 


// gsReferenceUtilisateur est une chaine
vWD_gsReferenceUtilisateur = new WDChaineU();

super.ajouterVariableGlobale("gsReferenceUtilisateur",vWD_gsReferenceUtilisateur);



}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_gsReferenceUtilisateur = WDVarNonAllouee.ref;
public String getVersionApplication(){ return "0.0.39.0";}
public String getNomSociete(){ return "AMLA CAMEROUN";}
public String getNomAPK(){ return "Capture piece d_identite";}
public int getIdNomApplication(){return com.masociete.capture_piece_d_identite.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.capture_piece_d_identite";}
public int getIdIconeApplication(){ return com.masociete.capture_piece_d_identite.R.drawable.i_c_o_n_e________2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 56;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 650;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Capture pièce d'identité";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "capture_piece_d_identite";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("E:\\Mes Projets Mobile\\prise photo document-v1\\LIN_Copyright-Sharring-Rights.png",com.masociete.capture_piece_d_identite.R.drawable.lin_copyright_sharring_rights_3, "");
super.ajouterFichierAssocie("E:\\Mes Projets Mobile\\Capture pièce d'identité\\WD_Serveur_Push.wdsdl",com.masociete.capture_piece_d_identite.R.raw.wd_serveur_push, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\CAPTURE.PNG?E5",com.masociete.capture_piece_d_identite.R.drawable.capture_5_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\ARROW.PNG",com.masociete.capture_piece_d_identite.R.drawable.arrow_6, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\CAPTURE1.PNG",com.masociete.capture_piece_d_identite.R.drawable.capture1_7, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\CODECAP.PNG",com.masociete.capture_piece_d_identite.R.drawable.codecap_8, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\FONDIMG1.PNG",com.masociete.capture_piece_d_identite.R.drawable.fondimg1_9, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\FORME0.PNG",com.masociete.capture_piece_d_identite.R.drawable.forme0_10, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.capture_piece_d_identite.R.drawable.phoenix_edt_11_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\LIN_COPYRIGHT-SHARRING-RIGHTS.PNG",com.masociete.capture_piece_d_identite.R.drawable.lin_copyright_sharring_rights_12, "");
super.ajouterFichierAssocie("E:\\MES PROJETS MOBILE\\CAPTURE PIÈCE D'IDENTITÉ\\OCR@DPI1X1.PNG?_3NP_10_10_10_10",com.masociete.capture_piece_d_identite.R.drawable.ocr_dpi1x1_13_np3_10_10_10_10, "");
}
// Initialisation des collections de procédures
public void initCollections()
{
GWDCPCOL_ProceduresGlobales.init();
GWDCPCOL_Push.init();

}


// Terminaison des collections de procédures
public void terminaisonCollections()
{
GWDCPCOL_Push.term();
GWDCPCOL_ProceduresGlobales.term();

}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPCapture_piece_d_identite.class;
}
}
}
