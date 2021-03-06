/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.verification.cosmosdb.repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import com.microsoft.azure.verification.cosmosdb.domain.User;

public interface UserRepository extends DocumentDbRepository<User, String> {
}
