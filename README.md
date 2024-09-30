# Hello Toast Project

Ce projet Android, "Hello Toast", est une application simple qui illustre l'utilisation de Toasts et de boutons dans une interface utilisateur. Il permet à l'utilisateur de voir un message à l'écran et d'incrémenter un compteur.

## Fonctionnalités

- Affichage d'un message Toast "Hello Toast!" lorsque le bouton "TOAST" est cliqué.
- Incrémentation d'un compteur et affichage de la valeur actuelle dans un `TextView` lorsque le bouton "COUNT" est cliqué.

## Technologies utilisées

- Android Studio
- Java
- XML pour la mise en page

## Configuration du projet

1. **Cloner le dépôt :**

   git clone  https://github.com/fatikhalil/Hello-Toast
## Ouvrir le projet

1. Ouvrez Android Studio.
2. Cliquez sur "Open an Existing Project".
3. Sélectionnez le dossier cloné.

## Exécuter l'application

1. Connectez un appareil Android ou démarrez un émulateur.
2. Cliquez sur le bouton "Run" dans Android Studio.

## Structure du projet

- **MainActivity.java** : La classe principale de l'application qui gère la logique de l'interface utilisateur.
- **activity_main.xml** : Le fichier de mise en page qui définit l'interface utilisateur avec des boutons et un compteur.

## Code Explication

### MainActivity.java

- **Counter** : Une variable pour garder la valeur du compteur.
- **onCreate()** : Méthode appelée lors de la création de l'activité. Elle lie les éléments de l'interface utilisateur avec leur ID et définit les actions pour les boutons.
- **Toast** : Utilisé pour afficher un message temporaire à l'utilisateur.
- **TextView** : Utilisé pour afficher la valeur actuelle du compteur.

### activity_main.xml

- **LinearLayout** : Un conteneur qui organise les éléments UI en colonne.
- **Button** : Deux boutons pour afficher le toast et incrémenter le compteur.
- **TextView** : Affiche la valeur actuelle du compteur.
## Demonstration vedio
https://github.com/user-attachments/assets/fef99870-6643-4911-967c-1ecbe7640189


## Auteur

- KHALILL Fatima
