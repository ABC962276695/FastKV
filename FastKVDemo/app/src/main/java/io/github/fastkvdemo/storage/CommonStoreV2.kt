package io.github.fastkvdemo.storage

import io.github.fastkvdemo.fastkv.KVData

object CommonStoreV2 : KVData("common_store"){
    var launchCount by int("launch_count")
    var deviceId by string("device_id")
    var installId by string("install_id")

    var hadWrittenData by boolean("had_written_data")
}