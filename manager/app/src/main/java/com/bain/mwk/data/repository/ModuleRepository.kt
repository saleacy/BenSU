package com.bain.mwk.data.repository

import com.bain.mwk.data.model.Module
import com.bain.mwk.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
