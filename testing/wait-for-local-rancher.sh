HEALTHCHECK_URI="${RANCHER_URL}/ping"

printf "Waiting for local rancher2 to be ready"

until $(curl -k --output /dev/null --silent --head --fail --max-time 2 ${HEALTHCHECK_URI}); do
    printf '.'
    sleep 2
done

echo
