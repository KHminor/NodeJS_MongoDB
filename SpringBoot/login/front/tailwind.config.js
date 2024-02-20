/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{js,jsx,ts,tsx}"],
  theme: {
    extend: {},
  },
  plugins: [
    ({ addUtilities }) => {
      addUtilities({
        ".f-c-c": {
          "@apply flex justify-center items-center": "",
        },
        ".h-s110": {
          "@apply cursor-pointer hover:scale-110 transition-all duration-150":
            "",
        },
      });
    },
  ],
};
