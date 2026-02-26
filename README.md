📘 BlogProject – Spring Boot REST API

A simple and clean **Blog Application** built using **Spring Boot**, following a layered architecture with **Controller → Service → Repository**, DTO conversions, and custom converters.  
This project provides complete CRUD operations for blog posts using RESTful APIs.

🚀 Features

*   ➕ **Create Blog** (POST `/add`)
*   📚 **Get All Blogs** (GET `/all`)
*   🔍 **Get Blog by ID** (GET `/blog/{id}`)
*   ❌ **Delete Blog by ID** and return deleted Blog DTO (DELETE `/{id}`)
*   ✏️ **Update Blog by ID** (PUT `/update/{id}`)
*   🔄 Uses **DTO pattern** for clean API responses
*   🔧 Has a **custom Converter** to convert Entity → DTO
*   🧱 Follows proper three-layer Spring Boot architecture

🏗️ Project Structure

    src/main/java/com/practice/BlogProject
    │
    ├── Controller
    │     └── BlogController.java
    │
    ├── Service
    │     ├── BlogService.java
    │     └── BlogServiceImpl.java
    │
    ├── Repository
    │     └── BlogRepository.java
    │
    ├── Entity
    │     └── Blog.java
    │
    └── dto
          └── BlogDto.java

🔄 API Endpoints

1️⃣ Add New Blog

**POST** `/api/v2/add`  
Request Body (JSON):

```json
{
  "title": "My First Blog",
  "content": "This is the content",
  "author": "Ankit"
}
```

2️⃣ Get All Blogs

**GET** `/api/v2/all`

3️⃣ Get Blog by ID

**GET** `/api/v2/blog/{id}`

4️⃣ Delete Blog & Return Deleted Blog

**DELETE** `/api/v2/{id}`

5️⃣ Update Blog

**PUT** `/api/v2/update/{id}`  
Request Body (JSON):

```json
{
  "title": "Updated Title",
  "content": "Updated Content",
  "author": "Ankit"
}
```

🧩 DTO & Converter

The project uses a **custom converter** to transform `Blog` entity into a clean `BlogDto`.  
This ensures API responses do not expose database structure and remain consistent.

🔧 Technologies Used

*   **Java 17+**
*   **Spring Boot**
*   **Spring Web**
*   **Spring Data JPA**
*   **Hibernate**
*   **MySQL / H2 (optional)**
*   **Maven**

▶️ How to Run

1.  Clone the repository:

```bash
git clone https://github.com/<your-username>/<repo-name>.git
```

2.  Open in IDE (IntelliJ / STS)

3.  Configure database in `application.properties`

4.  Run the Spring Boot application:

```bash
mvn spring-boot:run
```

📌 Future Enhancements

*   Add pagination and sorting
*   Add user authentication (JWT)
*   Add categories and tags
*   Add comments module
*   Add Swagger documentation

