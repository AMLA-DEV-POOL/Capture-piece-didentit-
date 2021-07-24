/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Collection
 * Classe Android : COL_ProcéduresGlobales
 * Date : 06/07/2021 04:24:17
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.json.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDCPCOL_ProceduresGlobales extends WDCollProcAndroid
{

public WDProjet getProjet()
{
return GWDPCapture_piece_d_identite.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPCapture_piece_d_identite.getInstance();
}

protected String getNomCollection()
{
return "COL_ProcéduresGlobales";
}
private final static GWDCPCOL_ProceduresGlobales ms_instance = new GWDCPCOL_ProceduresGlobales();
public final static GWDCPCOL_ProceduresGlobales getInstance()
{
return ms_instance;
}

// Code de déclaration de COL_ProcéduresGlobales
static public void init()
{
// 
ms_instance.initDeclarationCollection();


try
{
}
finally
{
finDeclarationCollection();
}

}




// Code de terminaison de COL_ProcéduresGlobales
static public void term()
{
// 
ms_instance.initTerminaisonCollection();


try
{
}
finally
{
finTerminaisonCollection();
}

}



// Nombre de Procédures : 2
static public WDObjet fWD_enregistrerImage( WDObjet vWD_imageSauvegarder , WDObjet vWD_nomImage , WDObjet vWD_extensionImage , WDObjet vWD_typeImage , WDObjet vWD_refUtilisateur )
{
// PROCÉDURE EnregistrerImage(imageSauvegarder, nomImage, extensionImage, typeImage, refUtilisateur)
ms_instance.initExecProcGlobale("EnregistrerImage");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_dateCreation = new WDDate();

WDObjet vWD_sRetourResultat = new WDChaineU();



// dateCreation est une Date = DateDuJour()

vWD_dateCreation.setValeur(WDAPIDate.dateDuJour());


// InitHasard()
WDAPIDiversSTD.initHasard();

// SI refUtilisateur = "" ALORS
if(vWD_refUtilisateur.opEgal("", 0))
{
// 	configurations.refUtilisateur		=  0000
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("refutilisateur").setValeur(0);

}
else
{
// 	configurations.refUtilisateur		= refUtilisateur
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("refutilisateur").setValeur(vWD_refUtilisateur);

}

// configurations.IDutilisateurs		= 001
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("idutilisateurs").setValeur(1);

// configurations.IDdocuments			= 000
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("iddocuments").setValeur(0);

// configurations.description			= "Aucune description"
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("description").setValeur("Aucune description");

// configurations.imageSauvegarder		= imageSauvegarder
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("imagesauvegarder").setValeur(vWD_imageSauvegarder);

// configurations.nomImage				= nomImage
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("nomimage").setValeur(vWD_nomImage);

// configurations.extensionImage		= extensionImage
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("extensionimage").setValeur(vWD_extensionImage);

// configurations.typeImage			= typeImage
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("typeimage").setValeur(vWD_typeImage);

// configurations.imageTelecharger		= 0
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("imagetelecharger").setValeur(0);

// configurations.imageTraiter			= 0
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("imagetraiter").setValeur(0);

// configurations.statut				= 0
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("statut").setValeur(0);

// configurations.dateCreation			= dateCreation
WDAPIHF.getFichierSansCasseNiAccent("configurations").getRubriqueSansCasseNiAccent("datecreation").setValeur(vWD_dateCreation);

// sRetourResultat est une chaîne


// SI HAjoute(configurations) ALORS
if(WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("configurations")).getBoolean())
{
// 	sRetourResultat = "Enregistrement réussi"
vWD_sRetourResultat.setValeur("Enregistrement réussi");

}
else
{
// 	sRetourResultat = "Erreur Enregistrement"+ ErreurInfo(errComplet)
vWD_sRetourResultat.setValeur(new WDChaineU("Erreur Enregistrement").opPlus(WDAPIVM.erreurInfo(19)));

}

// RENVOYER sRetourResultat
return vWD_sRetourResultat;

}
finally
{
finExecProcGlobale();
}

}


static public WDObjet fWD_verifierReferenceUtilisateur( WDObjet vWD_sReferenceUtilisateur )
{
// procédure VerifierReferenceUtilisateur(sReferenceUtilisateur est une chaine)
ms_instance.initExecProcGlobale("VerifierReferenceUtilisateur");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_oRequete = WDVarNonAllouee.ref;
WDObjet vWD_oReponse = WDVarNonAllouee.ref;
WDObjet vWD_retourRefUtilisateur = WDVarNonAllouee.ref;


vWD_sReferenceUtilisateur = WDParametre.traiterParametre(vWD_sReferenceUtilisateur, 1, false, 16);


// oRequête	est une httpRequête
vWD_oRequete = new WDInstance( new WDHTTPRequete() );


// oRéponse	est une httpRéponse
vWD_oReponse = new WDInstance( new WDHTTPReponse() );


// oRequête..URL		= "https://checktatoo.com/fr/processqualification/get/identification/data?v="+sReferenceUtilisateur
vWD_oRequete.setProp(EWDPropriete.PROP_URL,new WDChaineU("https://checktatoo.com/fr/processqualification/get/identification/data?v=").opPlus(vWD_sReferenceUtilisateur));

// oRequête..Méthode	= httpGet
vWD_oRequete.setProp(EWDPropriete.PROP_METHODE,1);

// oRéponse			= HTTPEnvoie(oRequête)
vWD_oReponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_oRequete));

// retourRefUtilisateur est un json = oRéponse..Contenu
vWD_retourRefUtilisateur = new WDInstance( new WDJSON() );

vWD_retourRefUtilisateur.setValeur(vWD_oReponse.getProp(EWDPropriete.PROP_CONTENU));


// SI retourRefUtilisateur.Etat = "SUCCESS" ALORS
if(vWD_retourRefUtilisateur.get("Etat").opEgal("SUCCESS", 0))
{
// 	renvoyer true
return new WDBooleen(true);

}
else
{
// 	renvoyer faux
return new WDBooleen(false);

}

}
finally
{
finExecProcGlobale();
}

}



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
