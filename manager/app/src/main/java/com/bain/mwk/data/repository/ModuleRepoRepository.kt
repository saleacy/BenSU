package com.bain.mwk.data.repository

import com.bain.mwk.data.model.RepoModule

interface ModuleRepoRepository {
    suspend fun fetchModules(): Result<List<RepoModule>>
}
