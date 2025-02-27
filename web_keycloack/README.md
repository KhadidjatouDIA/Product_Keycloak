# 📦 Product Management Web App

Une application web permettant de gérer des produits avec **Spring MVC** et sécurisée avec **Keycloak**.

## 📌 Fonctionnalités
-  Ajouter un produit (référence et nom)
- Afficher la liste des produits
- Authentification et autorisation via **Keycloak**

## 🛠 Technologies utilisées
```plaintext
- Java 17+ Spring Boot
- Spring MVC pour la gestion des contrôleurs et des vues
- Spring Data JPA + MySQL pour la gestion des données
- Thymeleaf pour l’affichage
- Keycloak pour l’authentification et la gestion des rôles
```
## 🚀 Installation et Configuration

### 1️⃣ Cloner le projet
```bash
git clone https://github.com/KhadidjatouDIA/Product_Keycloak.git
````
### 2️⃣ Configuration de Keycloak
1- Démarrer Keycloak (Docker recommandé) :
```bash
docker run -d -p 8080:8080 --name keycloak \
   -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin \
   quay.io/keycloak/keycloak:22.0 start-dev
```

2- Se connecter à Keycloak Admin via http://localhost:8080/admin   <br>
3- Créer un Realm : Web   <br>
4- Ajouter un Client : web-rest-api    <br>
5- Créer un Utilisateur : web        <br>


### 3️⃣ Configuration de l’application
Modifier src/main/resources/application.properties :
![img.png](img.png)

### 4️⃣ Lancer l’application:
![img_1.png](img_1.png)

### 5️⃣ Accéder à l’application:
- Acceder l'application via l'url: http://localhost:8081/ 
![img_2.png](img_2.png)

- Authentification avec Keycloak:   <br>
Lorsque vous accédez à **/products**, vous serez redirigé vers la page de connexion de Keycloak.
![img_3.png](img_3.png)

- Une fois connecté, vous verrez la liste des produits et pourrez en ajouter:
![img_4.png](img_4.png)

### Resultats
![img_5.png](img_5.png)

😊🚀
![img_6.png](img_6.png)

## Sur Postman
![img_7.png](img_7.png)
