(ns sever.model.twatt-model
  (:require [schemongo.models :as models]))

(def twatt-schema
  [:author :string]
  [:text :string])

(model "twatt" :twatts twat-schema)
