# Stage 0 Backend - Public API to Retrieve Basic Information

**Description**:  
This project is a simple public API that returns basic information including your registered email address, the current datetime in ISO 8601 format (UTC), and the GitHub URL of the project's codebase.

The API is deployed to a publicly accessible endpoint and handles Cross-Origin Resource Sharing (CORS) appropriately.

## Setup Instructions

To run this project locally, follow these steps:

### Prerequisites

Make sure you have the following software installed:

- Java 11 or later
- Maven (for managing dependencies)

### Clone the Repository

```bash
git clone https://github.com/Harkinsam/hng12-stage0-backend-api.git
cd your-repo
```
**Navigate to the project directory:**

```bash
cd your-repo
```
**Install Dependencies**

Run the following Maven command to install the necessary dependencies:

```bash
mvn install
```
Start the API server locally, and it should be accessible at http://localhost:4040.

# API Documentation

## Base URL
`http://localhost:4040/`

## Endpoint

### `GET /info`

This endpoint retrieves basic information.

#### Request

- **Method**: `GET`
- **URL**: `/info`
- **Headers**: No special headers required.

#### Response

The API will return the following data in JSON format:

```json
{
  "email": "your-email@example.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/yourusername/your-repo"
}
```
[Backlink to Hire Java Developers](https://hng.tech/hire/java-developers)

