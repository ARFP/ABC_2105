# Modélisation d'un système pour un jeu de cartes en ligne.

## Contexte

Dans ce jeu de cartes, 2 joueurs s'affrontent dans un duel. 

Les détails du fonctionnement du jeu sont peu importants ici.

Nous avons besoin d'un modèle pour stocker les différentes cartes et leurs caractéristiques.

Une carte possède les caractéristiques suivantes :

- Nom de la carte
- Puissance
- Armure
- Pouvoir

Une carte est associée à un type de cartes (Paladin, Mage, Druide, Espion...).

Un type de carte est caractérisé par un identifiant numérique, un nom de classe, une description sommaire et une énergie vitale (nature, givre, feu, lumière...). 

Chaque carte peut-être possédée par un ou plusieurs joueurs.

Un joueur peut posséder 0 ou plusieurs cartes.

Un joueur est identifié par un pseudo, un nom, un prénom et une adresse email.


# Consignes

Modéliser les éléments ci-dessus et représentez les dans un programme simple.

Pour tous les éléments ci-dessus, tous les attributs sont à minima acessibles en lecture (get).


Le détail des comportements des objets vous sera communiqué ultérieurement.

### Note
Ce TP sera réutilisé dans le module "Bases de données"