## Cum funcționează aplicația

Aplicația funcționează pe baza arhitecturii Spring Boot, urmând un model pe trei straturi:

1.  **Controller:** Primește cereri HTTP de la client (de exemplu, Postman). Deleagă logica de afaceri către stratul Service.
2.  **Service:** Conține logica de afaceri a aplicației. Primește cereri de la Controller și interacționează cu stratul Repository pentru a accesa sau manipula datele.
3.  **Repository:** Este responsabil pentru interacțiunea cu sursa de date (în acest caz, o bază de date PostgreSQL prin JPA). Oferă metode pentru a efectua operațiuni CRUD asupra entităților.

## Cum să testezi aplicația
1. **Deschide Postman și creează cereri HTTP către următoarele endpoint-uri:**

    * **GET Toate Jurnalele:**
        * Metoda: `GET`
        * URL: `http://localhost:8080/api/jurnale`

    * **GET Jurnal după ID:**
        * Metoda: `GET`
        * URL: `http://localhost:8080/api/jurnale/{id}` (înlocuiește `{id}` cu un ID real din baza de date, de exemplu, `1`)

    * **POST Adaugă Jurnal:**
        * Metoda: `POST`
        * URL: `http://localhost:8080/api/jurnale`
        * Body (raw - JSON):
            ```json
            {
                "data": "2025-03-29",
                "titlu": "Test Postman",
                "continut": "Aceasta este o intrare de test adăugată prin Postman.",
                "stareEmotionala": "Bun",
                "nivelEnergie": 4
            }
            ```

    * **PUT Actualizează Jurnal:**
        * Metoda: `PUT`
        * URL: `http://localhost:8080/api/jurnale/{id}` (înlocuiește `{id}` cu ID-ul jurnalului pe care vrei să-l actualizezi)
        * Body (raw - JSON):
            ```json
            {
                "id": 1,
                "data": "2025-03-30",
                "titlu": "Jurnal Actualizat",
                "continut": "Conținut actualizat prin Postman.",
                "stareEmotionala": "Foarte bine",
                "nivelEnergie": 5
            }
            ```

    * **DELETE Șterge Jurnal:**
        * Metoda: `DELETE`
        * URL: `http://localhost:8080/api/jurnale/{id}` (înlocuiește `{id}` cu ID-ul jurnalului pe care vrei să-l ștergi)