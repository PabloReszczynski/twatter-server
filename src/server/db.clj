(ns server.db
  (:require [monger.core :as mg]
            [clojure.tools.logging :as logger])
  (:import [com.mongodb MongoOptions ServerAddress]))


(def db
  (let [uri (System/getenv "MONGOHQ_URL")
        {:key [conn db]} (mg/connect-via-uri uri)])
  (logger/info "[DB] Connection to database succesfull")
  db)
