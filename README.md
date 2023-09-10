### Demo on belema drive app

# User API Endpoint Documentation

This document provides an overview of the User API endpoint, including how to use it, the available endpoints, request/response examples, and authentication details.

## Table of Contents
- [Overview](#overview)
- [Authentication](#authentication)
- [Available Endpoints](#available-endpoints)
- [Request and Response Examples](#request-and-response-examples)
- [Errors](#errors)

## Overview

The User API endpoint allows you to perform various operations related to user management in our application. You can create, retrieve, update, and delete user information using this API.

## Authentication

To access the User API endpoint, you need to authenticate your requests using an API key or other authentication mechanism. Please refer to our [Authentication Documentation](link-to-authentication-docs) for details on how to obtain and use an API key.

## Available Endpoints

- **GET /users/:id**: Retrieve user information by user ID.
- **POST /users**: Create a new user.
- **PUT /users/:id**: Update user information by user ID.
- **DELETE /users/:id**: Delete a user by user ID.

## Request and Response Examples

### GET /users/:id

**Request**
```http
GET /users/123


