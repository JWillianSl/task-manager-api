#!/bin/bash

PRIVATE_KEY="../src/main/resources/keys/private.pem"
PUBLIC_KEY="../src/main/resources/keys/public.pem"

if [ -f "$PRIVATE_KEY" ] && [ -f "$PUBLIC_KEY" ]; then
    echo "There are Keys!"
else
    openssl genrsa > $PRIVATE_KEY
    openssl rsa -in $PRIVATE_KEY -pubout -out $PUBLIC_KEY
    echo "The Keys are ready!"
fi