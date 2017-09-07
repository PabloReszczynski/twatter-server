(ns sever.model.user-model
  (:require [schemongo.models :as models]))

(def user-schema
  [:full_name :string]
  [:username :string]
  [:profile_pic_path :string])

(model "twatt" :twatts twat-schema)
