(ns server.core
  (:require [server.routes :refer [app]]
            [compojure.handler :as handler]))

(def handler
  (handler/site app))
