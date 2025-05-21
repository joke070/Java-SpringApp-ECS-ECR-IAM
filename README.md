# 🚀 Spring Boot App Deployment to AWS ECS with GitHub Actions

This project demonstrates how to build and deploy a simple Java Spring Boot application using Docker, push it to AWS ECR (Elastic Container Registry), and automatically deploy it to AWS ECS (Elastic Container Service) using GitHub Actions for CI/CD.

---

## 📸 Demo

🖥️ Access the deployed app at:  
**http://[your-ecs-task-public-ip]:8080/**  
(Replace with your actual public IP or domain name)

---

## ✅ Features

- 🔧 Java Spring Boot REST API (`GET /`)
- 🐳 Dockerized application
- ☁️ Container image stored in **AWS ECR**
- 🚢 Deployment via **AWS ECS (Fargate)**
- 🤖 Automated CI/CD with **GitHub Actions**
- 🔐 Secure deployment using **IAM + GitHub Secrets**

---

## 🧰 Tech Stack

| Tool           | Purpose                              |
|----------------|---------------------------------------|
| Java 17        | Backend language                     |
| Spring Boot    | REST API framework                   |
| Maven          | Build tool                           |
| Docker         | Containerization                     |
| AWS ECR        | Stores Docker images                 |
| AWS ECS        | Runs containers (Fargate launch type)|
| GitHub Actions | CI/CD pipeline                       |
| IAM            | AWS permissions & authentication     |

---

## 📦 How to Build and Run Locally\

# Clone the repository
git clone https://github.com/your-username/springboot-ecs-deploy.git
cd springboot-ecs-deploy

# Build the app
mvn package

# Build Docker image
docker build -t springboot-ecs-app .

# Run locally
docker run -p 8080:8080 springboot-ecs-app

 CI/CD with GitHub Actions
This project uses GitHub Actions to automate the entire deployment pipeline:
	•	On every push to main:	
 1.	Maven builds the .jar file
	
 2.	Docker builds the image
	
 3.	Pushes the image to AWS ECR

 4.	Updates the ECS service to use the new image

📝 Check out the CI/CD pipeline config in .github/workflows/deploy.yml.


What This Project Demonstrates
	
 •	✅ CI/CD with GitHub Actions
	
 •	🐳 Dockerizing a Java Spring Boot app
	
 •	🚀 Deploying to AWS ECS Fargate

 •	📦 Using AWS ECR as the container registry

 •	🔐 Configuring IAM roles for secure GitHub → AWS access

 •	💻 Running a production-like microservice in the cloud

 Author
Jonathan Chijioke
📧 quavjonathan@gmail.com
🔗 www.linkedin.com/in/chijioke-jonathan-3128072b7 
