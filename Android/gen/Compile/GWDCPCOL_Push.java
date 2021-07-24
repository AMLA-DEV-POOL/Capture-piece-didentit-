/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Collection
 * Classe Android : COL_Push
 * Date : 01/07/2021 16:48:05
 * Version de wdjava.dll  : 26.0.342.1
 */


package com.masociete.capture_piece_d_identite.wdgen;


import com.masociete.capture_piece_d_identite.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ws.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.notification.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDCPCOL_Push extends WDCollProcAndroid
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
return "COL_Push";
}
private final static GWDCPCOL_Push ms_instance = new GWDCPCOL_Push();
public final static GWDCPCOL_Push getInstance()
{
return ms_instance;
}

// Code de déclaration de COL_Push
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




// Code de terminaison de COL_Push
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
//  Résumé : Callback appelée après l'enregistrement auprès du service des notifications Android
//  Syntaxe :
// ActivationNotifPush (<bufIdentifiant> est buffer, <sErreur> est chaîne)
// 
//  Paramètres :
// 	bufIdentifiant (buffer) : L'identifiant à stocker sur le serveur
// 	sErreur (chaîne UNICODE) : Le message d'erreur si l'activation n'a pas fonctionné
// 
static public void fWD_activationNotifPush( WDObjet vWD_bufIdentifiant , WDObjet vWD_sErreur )
{
// PROCÉDURE ActivationNotifPush(bufIdentifiant est un Buffer, sErreur est une chaîne)
ms_instance.initExecProcGlobale("ActivationNotifPush");


try
{
vWD_bufIdentifiant = WDParametre.traiterParametre(vWD_bufIdentifiant, 1, false, 28);

vWD_sErreur = WDParametre.traiterParametre(vWD_sErreur, 2, false, 16);


// SI Taille(bufIdentifiant) > 0 ALORS
if(WDAPIChaine.taille(vWD_bufIdentifiant).opSup(0))
{
// 	<COMPILE SI Configuration="Application Android">		
{
// 		WD_Serveur_Push.AjouteIdentifiantAndroid(bufIdentifiant,SysVersionAndroid(),gsReferenceUtilisateur)		
WDWSManager.getClientWS("WD_Serveur_Push", "WD_Serveur_Push").invoquerMethode("AjouteIdentifiantAndroid", new WDObjet[] {vWD_bufIdentifiant,WDAPISys.sysVersionAndroid(),GWDPCapture_piece_d_identite.getInstance().vWD_gsReferenceUtilisateur} );

}

// 	<COMPILE SI Configuration="Application iOS">		

// 	SI ErreurDétectée() ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 		Erreur("Echec de l'appel au service Web",ErreurInfo())
WDAPIDialogue.erreur("Echec de l'appel au service Web",new String[] {WDAPIVM.erreurInfo().getString()} );

}

}
else
{
// 	Erreur("Erreur d’enregistrement : ", sErreur)
WDAPIDialogue.erreur("Erreur d’enregistrement : ",new String[] {vWD_sErreur.getString()} );

}

}
finally
{
finExecProcGlobale();
}

}


//  Résumé : Callback appelée lors de la réception d'une notification PUSH
//  Syntaxe :
// RéceptionNotifPush (<maNotif> est Notification)
// 
//  Paramètres :
// 	maNotif (Notification) : La notification reçu
// 
static public void fWD_receptionNotifPush( WDObjet vWD_maNotif )
{
// PROCÉDURE RéceptionNotifPush(maNotif est un Notification)
ms_instance.initExecProcGlobale("RéceptionNotifPush");


try
{
vWD_maNotif = WDParametre.traiterParametreClasse(vWD_maNotif, 1, false, WDNotification.class, 111);


// Info(ChaîneConstruit("Notification reçue avec comme message ""%1"" et comme contenu ""%2""" , maNotif..Message,maNotif..Contenu))
WDAPIDialogue.info(WDAPIChaine.chaineConstruit(new WDChaineU("Notification reçue avec comme message \"%1\" et comme contenu \"%2\""),new String[] {vWD_maNotif.getProp(EWDPropriete.PROP_MESSAGE).getString(),vWD_maNotif.getProp(EWDPropriete.PROP_CONTENU).getString()} ).getString());

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
