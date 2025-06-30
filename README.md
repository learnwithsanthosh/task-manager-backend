# Day 10 – Task Manager App (Spring Boot Setup)

## ✅ What was done:
- Initialized new Spring Boot project `task-manager-backend`
- Added dependencies: Web, JPA, H2, Lombok
- Created Task entity with fields: id, title, description, completed, createdAt
- Configured database and tested basic connection
- Created base REST controller and repository

# Day 12 – Spring Boot CORS Configuration for React Integration

## ✅ What was done:
- Added `WebConfig` class to configure global CORS settings
- Enabled React frontend (`http://localhost:5173`) to access backend API
- Allowed HTTP methods: GET, POST, PUT, DELETE
- CORS now unblocks communication between frontend and backend (on different ports)

## 📁 File Added:
- `WebConfig.java` under `webConfig` package

## 🔗 Next Step:
- Continue frontend integration using Axios to consume backend API
