(ns server.api.core
  (:require [clojure.edn :as edn]
            [com.walmartlabs.lacinia.util :refer [attach-resolvers]]
            [com.walmartlabs.lacinia.schema :as schema]))

(def twatter-schema
  (-> "schema.edn"
      slurp
      edn/read-string
      (attach-resolvers {:get-twatter get-twatter})
      schema/compile))
