package com.solana

import com.solana.api.Api
import com.solana.networking.NetworkingRouter

class Solana(val router: NetworkingRouter, val api: Api = Api(router)) {
    fun someLibraryMethod(): Boolean {
        return true
    }
}
